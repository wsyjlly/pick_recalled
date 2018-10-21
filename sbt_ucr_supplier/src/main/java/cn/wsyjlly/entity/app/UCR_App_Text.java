package cn.wsyjlly.entity.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author     晏沈威
 * @type_name  UCR_app_text
 * @createtime 2018年9月8日 下午2:03:21
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Text implements Serializable{
	private Integer textID;
	private String 	ttextcontent;
	private Integer tlevel;
	private Integer t_primarymoduleID;
	private Integer t_secondarymoduleID;
	private UCR_App_Image ucr_app_image;
}
