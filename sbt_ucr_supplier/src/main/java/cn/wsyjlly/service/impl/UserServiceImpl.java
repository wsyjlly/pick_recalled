package cn.wsyjlly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import cn.wsyjlly.entity.user.UCR_User;
import cn.wsyjlly.entity.user.UCR_User_Address;
import cn.wsyjlly.entity.user.UCR_User_Collect;
import cn.wsyjlly.entity.user.UCR_User_Order;
import cn.wsyjlly.entity.user.UCR_User_Order_Reservation;
import cn.wsyjlly.entity.user.UCR_User_Reservation_Pool;
import cn.wsyjlly.mapper.user.UserAddressMapper;
import cn.wsyjlly.mapper.user.UserCollectMapper;
import cn.wsyjlly.mapper.user.UserMapper;
import cn.wsyjlly.mapper.user.UserMessageMapper;
import cn.wsyjlly.mapper.user.UserOrderMapper;
import cn.wsyjlly.mapper.user.UserOrderReservationMapper;
import cn.wsyjlly.mapper.user.UserReservationPoolMapper;
import cn.wsyjlly.service.inter.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMappper;
	@Autowired
	private UserMessageMapper userMessageMapper;
	@Autowired
	private UserAddressMapper userAddressMapper;
	@Autowired
	private UserCollectMapper userCollectMapper;
	@Autowired
	private UserOrderMapper userOrderMapper;
	@Autowired
	private UserReservationPoolMapper userReservationPoolMapper;
	@Autowired
	private UserOrderReservationMapper userOrderReservationMapper;
	
	@Override
	public UCR_User getUserByuserID(Long userID) {
		List<UCR_User_Order> list = userOrderMapper.selectList(new EntityWrapper<UCR_User_Order>().eq("o_userID", userID));
		for (UCR_User_Order ucr_user_order : list) {
			ucr_user_order.setUcr_user_order_reservation(userOrderReservationMapper.selectList(new EntityWrapper<UCR_User_Order_Reservation>().eq("r_orderID", ucr_user_order.getOrderID())));
		}
		UCR_User user =  userMappper.selectOne(new UCR_User().setUserID(userID))
				.setUcr_user_message(userMessageMapper.selectById(userID))
				.setUcr_user_order(list)
				.setUcr_user_address(userAddressMapper.selectList(new EntityWrapper<UCR_User_Address>().eq("a_userID", userID)))
				.setUcr_user_collect(userCollectMapper.selectList(new EntityWrapper<UCR_User_Collect>().eq("collectID", userID)))
				.setUcr_user_reservation_pool(userReservationPoolMapper.selectList(new EntityWrapper<UCR_User_Reservation_Pool>().eq("poolID", userID)));
		//System.out.println(userMessageMapper.selectById(userID));
		//System.out.println(user);
		return user;
	}
	@Override
	public Long getUserIDByopenID(String openID) {
		UCR_User user = new UCR_User().setUopenID(openID);
		return userMappper.selectOne(user).getUserID();
	}
	@Override
	public int insertUser(UCR_User user) {
		return userMappper.insert(user);
	}
	@Override
	public int judgeUserExists(String openID) {
		UCR_User user = new UCR_User().setUopenID(openID);
		return userMappper.selectOne(user)==null? 0:1;
	}



}
