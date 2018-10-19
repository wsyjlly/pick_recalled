package cn.wsyjlly.entity.user;

import java.io.Serializable;
import java.sql.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_message
 * @createtime 2018年9月8日 下午1:47:32
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_message")
public class UCR_User_Message implements Serializable{
	@TableId
	private Long messageID;
	private String mname;
	private String msex;
	private Date mbirthday;
	private String mphone;
	private String mqq;
	private String memail;
	private String mdescription;
}
