package cn.wsyjlly.entity.supplier;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_reservation_type
 * @createtime 2018年9月8日 下午1:55:33
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Reservation_Type implements Serializable{
	private String typeID;
	private String tname_1;
	private String tname_2;
	private String tname_3;
	private String tname_4;
	private Float  toriginprice;
	private Float  tnewprice;
	private Float  tprice;
	private String tpicture;
	private Integer trepertory;
	private Long   t_reservationID;
	private List<UCR_Supplier_Reservation_Method> ucr_supplier_reservation_method;
}
