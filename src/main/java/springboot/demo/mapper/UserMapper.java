package springboot.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springboot.demo.model.User;

@Mapper
public interface UserMapper {
    
    void addUser(User user);
    
    void updateUser(User user);
    
    void deleteUserById(Long id);
    
    List<User> findUserList();
    
}
