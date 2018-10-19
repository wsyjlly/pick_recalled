package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.sql.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_order_reservation
 * @createtime 2018年9月8日 下午1:41:34
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_order_reservation")
public class UCR_User_Order_Reservation implements Serializable{
	private Long reservationID;
	private String rname_1;
	private String rname_2;
	private String rname_3;
	private String rname_4;
	private Integer rcount;
	private Date rtime;
	private String r_orderID;
	@TableField(exist=false)
	private UCR_User_Comment ucr_user_comment;
	
}
