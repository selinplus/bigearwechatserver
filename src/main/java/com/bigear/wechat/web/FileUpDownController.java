package com.bigear.wechat.web;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.bigear.wechat.configurer.FileUploadProperties;
import com.bigear.wechat.configurer.WechatMpProperties;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
@EnableConfigurationProperties(FileUploadProperties.class)
public class FileUpDownController {
  @Autowired
  private FileUploadProperties properties;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws FileNotFoundException {
      if (!file.isEmpty()) {  
        String saveFileName = new Date().getTime() + file.getOriginalFilename();  
        // File saveFile = new File(request.getSession().getServletContext().getRealPath("/upload/") + saveFileName); 
        // // File saveFile = new File(saveFileName);
        // System.out.println("saveFile: " + saveFile.toString()); 
        // // String contextPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
        // // System.out.println("contextPath: " + contextPath);
        // if (!saveFile.getParentFile().exists()) {  
        //     saveFile.getParentFile().mkdirs();  
        // }  
        System.out.println("uploadPath: " + this.properties.getPath());
        File path = new File(this.properties.getPath());
        //获取跟目录
        // File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        // System.out.println("path: "+ path.getAbsolutePath());
        File upload = new File(path.getAbsolutePath(),"upload");
        if(!upload.exists()) upload.mkdirs();
        String saveFile = upload + "/" + saveFileName;
        try {  
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));  
            out.write(file.getBytes());  
            out.flush();  
            out.close();  
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("path", saveFileName);
            jsonObject.put("msg", "上传成功");
            return jsonObject.toJSONString();
            // return "{ \"path\": saveFile, \"msg\": \"上传成功\" }";  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
            return "上传失败," + e.getMessage();  
        } catch (IOException e) {  
            e.printStackTrace();  
            return "上传失败," + e.getMessage();  
          }  
      } else {  
          return "上传失败，因为文件为空.";  
      }  
    }
    
    @RequestMapping("/downloadFile/{fileId}")  
    public void downloadFileAction(HttpServletRequest request, HttpServletResponse response,@RequestParam("fileId") String fileId) {  
      
        response.setCharacterEncoding(request.getCharacterEncoding());  
        response.setContentType("application/octet-stream");  
        FileInputStream fis = null;  
        try {  
        	// TODO: file id convert to physical file path and name
        	String rootPath = request.getSession().getServletContext().getRealPath("");
        	String path = id2Path(rootPath,fileId);
            File file = new File(path);  
            fis = new FileInputStream(file);  
            response.setHeader("Content-Disposition", "attachment; filename="+file.getName());  
            IOUtils.copy(fis,response.getOutputStream());  
            response.flushBuffer();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (fis != null) {  
                try {  
                    fis.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }

	private String id2Path(String path, String fileId) {
		// TODO Auto-generated method stub
		String filename = path+"/upload/"+fileId;
		File file = new File(filename);
		if(file.exists()) {
			return filename;
		}
		return "";
	}  
}
