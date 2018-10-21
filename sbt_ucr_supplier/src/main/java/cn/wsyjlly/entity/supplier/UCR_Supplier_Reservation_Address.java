package cn.wsyjlly.entity.supplier;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_reservation_address
 * @createtime 2018年9月8日 下午1:49:58
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Reservation_Address implements Serializable{
	private Long addressID;
	private String aprovince;
	private String acity;
	private String acounty;
	private String atown;
	private String adetail;
}
