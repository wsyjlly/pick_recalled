package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import cn.wsyjlly.entity.supplier.UCR_Supplier_Reservation;
import cn.wsyjlly.entity.supplier.UCR_Supplier_Reservation_Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_reservation_pool
 * @createtime 2018年9月8日 下午1:36:01
 */

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
@TableName(value="ucr_user_reservation_pool")
public class UCR_User_Reservation_Pool implements Serializable{
	private Long poolID;
	private String pname_1;
	private String pname_2;
	private String pname_3;
	private String pname_4;
	private Integer pcount;
	private String pmethod;
	private Date ptime;
	private Date pinsert_time;
	private Long p_reservationID;
	@TableField(exist=false)
	private UCR_Supplier_Reservation ucr_supplier_reservation;
	@TableField(exist=false)
	private UCR_Supplier_Reservation_Type ucr_supplier_reservation_type;
}
