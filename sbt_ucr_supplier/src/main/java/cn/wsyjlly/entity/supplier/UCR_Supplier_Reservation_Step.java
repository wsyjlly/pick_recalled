package cn.wsyjlly.entity.supplier;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_reservation_step
 * @createtime 2018年9月8日 下午1:52:55
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Reservation_Step implements Serializable{
	private String stepID;
	private String ssetp;
	private Long s_reservationID;
}
