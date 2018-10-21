package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
 * @type_name  UCR_user_comment
 * @createtime 2018年9月8日 下午1:46:48
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_comment")
public class UCR_User_Comment  implements Serializable{
	private Long c_userID;
	private String c_orderID;
	private Long c_reservationID;
	private String ccomment;
	private Integer cstarlevel;
	private Integer ccommendcount;
	private Integer cscantimes;
	private Date ctime;
	private UCR_User ucr_user;
	@TableField(exist=false)
	private UCR_Supplier_Reservation ucr_supplier_reservation;
	@TableField(exist=false)
	private List<UCR_User_Comment_Picture> ucr_user_comment_picture;
}
