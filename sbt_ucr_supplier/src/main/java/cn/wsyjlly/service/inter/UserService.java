package cn.wsyjlly.service.inter;

import cn.wsyjlly.entity.user.UCR_User;

public interface UserService {
	public UCR_User getUserByuserID(Long userID);
	public Long getUserIDByopenID(String openID);
	public int judgeUserExists(String openID);
	public int insertUser(UCR_User user);
}	
