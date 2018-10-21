package cn.wsyjlly.entity.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_app_text_primarymenu
 * @createtime 2018年9月8日 下午2:02:17
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Text_Primarymenu implements Serializable{
	private Integer primarymenuID;
	private String pname;
	private String pphoto;
}
