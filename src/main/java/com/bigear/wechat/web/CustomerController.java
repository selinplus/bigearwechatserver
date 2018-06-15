package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.dto.Car;
import com.bigear.wechat.dto.Register;
import com.bigear.wechat.model.Customer;
import com.bigear.wechat.model.Photo;
import com.bigear.wechat.model.Platenum;
import com.bigear.wechat.service.CustomerService;
import com.bigear.wechat.service.PhotoService;
import com.bigear.wechat.service.PlatenumService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
* Created by selinplus on 2018/06/05.
*/
@RestController
@RequestMapping("/customer")
@SuppressWarnings({"rawtypes", "unchecked"})
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @Resource
    private PlatenumService platenumService;
    @Resource
    private PhotoService photoService;

    @PostMapping("/add")
    public Result add(@RequestBody Register register) {
        // System.out.println("*************register*************" + register.getCustomer().getOpenid());
        // System.out.println("*********" + test);
        Customer customer = register.getCustomer();
        customerService.save(customer);
        List<Car> cars = register.getCars();
        for (int i=0; i<cars.size(); i++) {
          Platenum platenum = new Platenum();
          String openid = register.getCustomer().getOpenid();
          long customerId = customerService.findBy("openid", openid).getId();
          platenum.setCustomerId(customerId);
          platenum.setPlatenum(cars.get(i).getPlateNum());
          System.out.println(platenum.getCustomerId() + "******************");
          platenumService.save(platenum);
          List<String> photos = cars.get(i).getPhotos();
          System.out.println("*********photosSize" + photos.size());
          for (int j=0; j<photos.size(); j++) {
            Photo photo = new Photo();
            long platenumId = platenumService.findBy("platenum", cars.get(i).getPlateNum()).getId();
            photo.setPlatenumId(platenumId);
            photo.setPhoto(photos.get(j));
            photoService.save(photo);
          }
        }
        
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        System.out.println("##########" + id);
        long customerId = id;
        List<Platenum> platenums = platenumService.getPlatenumList(customerId);
        for (int i=0; i<platenums.size(); i++) {
          photoService.deleteByPlatenumId(platenums.get(i).getId());
        }
        platenumService.deleteByCustomerId(customerId);
        customerService.deleteByCustomerId(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Customer customer) {
        customerService.update(customer);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Customer customer = customerService.findById(id);
        return ResultGenerator.genSuccessResult(customer);
    }

    @PostMapping("/list")
    public Result list(@RequestParam("openid") String openid) {
        Customer customer = customerService.findBy("openid", openid);
        if (customer == null) return ResultGenerator.genSuccessResult();
        List<Platenum> platenumList = platenumService.getPlatenumList(customer.getId());
        // System.out.println("size**********" + platenumList.size());
        Register register = new Register();
        register.setCustomer(customer);
        List<Car> cars = new ArrayList<Car>();
        for (int i=0; i<platenumList.size(); i++) {
          List<String> photos = photoService.getPhotoList(platenumList.get(i).getId());
          Car car = new Car();
          car.setPlateNum(platenumList.get(i).getPlatenum());
          car.setPhotos(photos);
          cars.add(car);
        }
        register.setCars(cars);
        return ResultGenerator.genSuccessResult(register);
    }
}
