package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/**
 * @author     晏沈威
 * @type_name  UCR_user
 * @createtime 2018年9月8日 下午12:37:09
 */
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
@TableName(value="ucr_user")
public class UCR_User implements Serializable{
	/*
	 * @TableId:
	 * value: 指定表中的主键列的列名， 如果实体属性名与列名一致，可以省略不指定. 
	 * type: 指定主键策略. 
	 */
	@TableId(value="userID" , type=IdType.AUTO)
	private Long userID;
	
	private String unickname;
	
	@TableField(fill=FieldFill.INSERT)
	private String upicture;
	
	private String uphone;
	
	private String uopenID;
	
	@TableField(exist=false)
	private UCR_User_Message ucr_user_message;
	
	@TableField(exist=false)
	private List<UCR_User_Address> ucr_user_address;
	
	@TableField(exist=false)
	private List<UCR_User_Collect> ucr_user_collect;
	
	@TableField(exist=false)
	private List<UCR_User_Order> ucr_user_order;
	
	@TableField(exist=false)
	private List<UCR_User_Reservation_Pool> ucr_user_reservation_pool;
	
}
