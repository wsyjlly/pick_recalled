package cn.wsyjlly.mapper.user;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import cn.wsyjlly.entity.user.UCR_User;
/**
 * @author     晏沈威
 * @type_name  UserMapper
 * @createtime 2018年9月8日 下午4:09:53
 * 
 * 
 * Mapper接口
 * 基于Mybatis:  在Mapper接口中编写CRUD相关的方法  提供Mapper接口所对应的SQL映射文件 以及 方法对应的SQL语句. 
 * 基于MP:  让XxxMapper接口继承 BaseMapper接口即可.
 * 		   BaseMapper<T> : 泛型指定的就是当前Mapper接口所操作的实体类类型 
 * 
 */

@Mapper
public interface UserMapper extends 	BaseMapper<UCR_User>{}
