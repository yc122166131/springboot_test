package com.shmcc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shmcc.entity.User;



@Mapper
public interface UserMapper {

	 @Select("select * from User1 where id=#{id}")
	 public List<User> getUserById(Long id);
	 
	 public List<User> getUserByName(User u);
	 
	 
}
