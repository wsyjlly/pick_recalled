package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_order
 * @createtime 2018年9月8日 下午1:39:40
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_order")
public class UCR_User_Order implements Serializable{
	private String orderID;
	private Date ocreatetime;
	private Integer ostatus;
	private Integer ocount;
	private Float omoney;
	private Long o_userID;
	private String o_addressID;
	@TableField(exist=false)
	private List<UCR_User_Order_Reservation> ucr_user_order_reservation;
}
