package cn.wsyjlly.entity.supplier;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_supplier_location
 * @createtime 2018年9月8日 下午1:49:24
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_Supplier_Location implements Serializable{
	private Long locationID;
	private Double llongitude;
	private Double llatitude;
	private String lprovince;
	private String lcity;
	private String lcounty;
	private String ltown;
	private String ldetail;
}
