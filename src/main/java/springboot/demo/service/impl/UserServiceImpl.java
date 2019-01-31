package springboot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.demo.mapper.UserMapper;
import springboot.demo.model.User;
import springboot.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User addUser(User user) {
        userMapper.addUser(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userMapper.updateUser(user);
        return user;
    }

    @Override
    public Boolean deleteUserById(Long id) {
        userMapper.deleteUserById(id);
        return true;
    }

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }

}
