package cn.wsyjlly.entity.app;

import java.io.Serializable;

import cn.wsyjlly.entity.supplier.UCR_Supplier_Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * 
 * @author     晏沈威
 * @type_name  UCR_app_recommend
 * @createtime 2018年9月8日 下午2:01:24
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Recommend implements Serializable{
	private Integer recommendID;
	private Integer rcode;
	private Integer rlevel;
	private Long r_reservationID;
	private UCR_Supplier_Reservation ucr_supplier_reservation;
}
