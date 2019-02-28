package springboot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import springboot.demo.mapper1.UserPrimaryMapper;
import springboot.demo.mapper2.UserSecondaryMapper;
import springboot.demo.model.User;
import springboot.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserPrimaryMapper userPrimaryMapper;
    
    @Autowired
    private UserSecondaryMapper userSecondaryMapper;
    
    @Override
    public User addUser(User user) {
        userPrimaryMapper.insert(user);
        userSecondaryMapper.insert(user);
        int i = 1/0;
        return user;
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

    @Override
    public Boolean deleteUserById(Long id) {
        return true;
    }

    @Override
    public List<User> findUserList() {
        return null;
    }

    @Override
    public PageInfo<User> findUserListForPage() {
        return null;
    }
    
}
