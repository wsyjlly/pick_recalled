package cn.wsyjlly.entity.supplier;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import cn.wsyjlly.entity.user.UCR_User_Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_reservation
 * @createtime 2018年9月8日 下午1:56:57
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Reservation implements Serializable{
	private Long reservationID;
	private String rname;
	private String rpicture;
	private String rdescription;
	private Float roriginprice;
	private Float rnewprice;
	private Float rprice;
	private Date rtime;
	private Long rrank;
	private Integer rcollect_count;
	private Integer rcount;
	private Integer rstarlevel;
	private Integer rrepertory;
	private Integer r_comment_count;
	private Long r_supplierID;
	private UCR_Supplier ucr_supplier;
	private UCR_Supplier_Reservation_Address ucr_supplier_reservation_address;
	private List<UCR_Supplier_Reservation_Picture> ucr_supplier_reservation_picture;
	private List<UCR_Supplier_Reservation_Step> ucr_supplier_reservation_step;
	private List<UCR_Supplier_Reservation_Time> ucr_supplier_reservation_time;
	private List<UCR_Supplier_Reservation_Tip> ucr_supplier_reservation_tip;
	private List<UCR_Supplier_Reservation_Type> ucr_supplier_reservation_type;
	private List<UCR_Supplier_Reservation_Method> ucr_supplier_reservation_method;
	private List<UCR_Supplier_Reservation_Type_Title> ucr_supplier_reservation_type_title;
	private List<UCR_User_Comment> ucr_user_comment;
}
