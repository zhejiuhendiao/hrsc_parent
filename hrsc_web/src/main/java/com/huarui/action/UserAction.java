package com.huarui.action;

import com.huarui.model.Users;
import com.huarui.service.UserService;
import impl.UserServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAction {
    @RequestMapping("/testfindall")
    @ResponseBody
    public List<Users>findall(){
        UserService service=new UserServiceimpl();
        return service.findall();
    }
}
