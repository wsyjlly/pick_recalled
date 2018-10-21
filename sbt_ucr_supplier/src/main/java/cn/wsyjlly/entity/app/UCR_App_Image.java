package cn.wsyjlly.entity.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_app_image
 * @createtime 2018年9月8日 下午1:59:52
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Image implements Serializable{
	private Long imageID;
	private String iimageurl;
	private Integer ilevel;
	private Integer i_primarymoduleID;
	private Integer i_secondarymoduleID;
	private UCR_App_Text ucr_app_text;
}
