package springboot.demo.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import springboot.demo.model.User;

public interface UserService {

    User addUser(User user);

    User updateUser(User user);

    Boolean deleteUserById(Long id);

    List<User> findUserList();

    PageInfo<User> findUserListForPage();

}
