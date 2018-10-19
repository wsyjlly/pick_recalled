package cn.wsyjlly.entity.supplier;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_reservation_method
 * @createtime 2018年9月8日 下午1:50:38
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Reservation_Method implements Serializable{
	private Integer methodID;
	private String mname;
	private Long m_reservationID;
}
