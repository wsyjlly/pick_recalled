package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import cn.wsyjlly.entity.supplier.UCR_Supplier_Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_collect
 * @createtime 2018年9月8日 下午1:44:26
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_collect")
public class UCR_User_Collect implements Serializable{
	private Long collectID;
	private Date ctime;
	private Long c_reservationID;
	@TableField(exist=false)
	private UCR_Supplier_Reservation ucr_supplier_reservation;
}
