package cn.wsyjlly.entity.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author     晏沈威
 * @type_name  UCR_app_text_secondarymenu
 * @createtime 2018年9月8日 下午2:02:48
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Text_Secondarymenu implements Serializable{
	private Integer secondarymenuID;
	private String sname;
	private String smodule;
	private String sphoto;
	private Integer s_primarymenuID;
}
