package cn.alvin.web.action;


import java.io.File;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class ArticleAction extends ActionSupport{

    private File photo;

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    
    public String add() throws Exception {
       
        String path = ServletActionContext.getServletContext().getRealPath("/photo");
        System.out.println(path);
        System.out.println(photo);
        photo.renameTo(new File(path+"/aaaa.jpg"));
        
        
        return SUCCESS;
    }
    
    
    
    
}
