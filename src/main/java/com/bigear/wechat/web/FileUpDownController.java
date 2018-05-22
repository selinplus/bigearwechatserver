package com.bigear.wechat.web;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

public class FileUpDownController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                //TODO:保存文件路径。
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return "上传成功";
        } else {
            return "上传失败，因为文件是空的.";
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
