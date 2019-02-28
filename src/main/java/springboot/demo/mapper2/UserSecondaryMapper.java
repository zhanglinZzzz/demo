package springboot.demo.mapper2;

import java.util.List;

import springboot.demo.model.User;

public interface UserSecondaryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findUserList();
}