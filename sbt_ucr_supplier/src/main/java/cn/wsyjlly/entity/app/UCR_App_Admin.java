package cn.wsyjlly.entity.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_app_admin
 * @createtime 2018年9月8日 下午1:59:24
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class UCR_App_Admin implements Serializable{
	private String adminID;
	private String aname;
	private String apassword;
	private String aphotourl;
	private String aphone;
	private String asex;
	private Integer asuperadmin;
}
