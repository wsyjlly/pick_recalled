package cn.wsyjlly.entity.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_app_secondarymodule
 * @createtime 2018年9月8日 下午2:01:44
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Secondarymodule implements Serializable{
	private Integer secondarymoduleID;
	private String sname;
	private Integer s_primarymoduleID;
}
