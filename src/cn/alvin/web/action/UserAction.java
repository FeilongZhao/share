package cn.alvin.web.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.alvin.service.UserService;

public class UserAction extends ActionSupport{
    
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    
    public String login() throws Exception {
        
        System.out.println(userService);
        return SUCCESS;
    }
    

}