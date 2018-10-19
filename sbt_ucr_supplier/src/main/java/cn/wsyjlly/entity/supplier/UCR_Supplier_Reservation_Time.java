package cn.wsyjlly.entity.supplier;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_reservation_time
 * @createtime 2018年9月8日 下午1:53:37
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Reservation_Time implements Serializable{
	private String timeID;
	private Date tstrattime;
	private Date tendtime;
	private String t_reservationID;
}
