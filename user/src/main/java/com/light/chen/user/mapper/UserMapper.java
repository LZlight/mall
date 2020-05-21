package com.light.chen.user.mapper;
import com.light.chen.user.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author light
 * @Date 2020/5/21 8:29 下午
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByPhone(@Param("phone")String phone);


}