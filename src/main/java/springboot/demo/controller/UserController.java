package springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.demo.model.User;
import springboot.demo.service.UserService;

@RestController
@RequestMapping("/userManage")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/addUser")
    public User addUser(User user){
        return userService.addUser(user);
    }
    
    @RequestMapping("/updateUser")
    public User updateUser(User user){
        return userService.updateUser(user);
    }
    
    @RequestMapping("/deleteUserById")
    public Boolean deleteUserById(Long id){
        return userService.deleteUserById(id);
    }
    
    @RequestMapping("/findUserList")
    public List<User> findUserList(){
        return userService.findUserList();
    }
    
}
