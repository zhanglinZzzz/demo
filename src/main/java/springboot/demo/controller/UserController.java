package springboot.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.demo.model.User;

@RestController
public class UserController {

    @RequestMapping(name = "/getUser", method = RequestMethod.POST)
    public User getUser() {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setPassword("11111111");
        return user;
    }

    /**
     * http://localhost:8080/getUserByName?name=zhangsan
     * 
     * @param user
     * @return
     */
    @RequestMapping("/getUserByName")
    public String getUserByName(User user) {
        return user.getName();
    }

    /**
     * http://localhost:8080/get/zhangsan
     * 
     * @param name
     * @return
     */
    @RequestMapping("/get/{name}")
    public String getUserByName(@PathVariable String name) {
        return name;
    }

}
