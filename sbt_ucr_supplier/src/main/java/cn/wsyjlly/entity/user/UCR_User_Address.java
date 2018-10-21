package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_address
 * @createtime 2018年9月8日 下午1:43:18
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_address")
public class UCR_User_Address implements Serializable{
	private String addressID;
	private Date atime;
	private String aprovince;
	private String acity;
	private String acounty;
	private String atown;
	private String adetail;
	private Integer adefault;
	private Long a_userID;
}
