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
 * @type_name  UCR_supplier
 * @createtime 2018年9月8日 下午1:58:25
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier implements Serializable{
	private Long supplierID;
	private String spassword;
	private String slogo;
	private String sshopname;
	private String sname;
	private String stype;
	private String sidcardname;
	private String sidcardNo;
	private String sphone;
	private String swxID;
	private List<UCR_Supplier_Reservation> ucr_supplier_reservation;
	private UCR_Supplier_Location ucr_supplier_location;
}
