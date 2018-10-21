package cn.wsyjlly.entity.user;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author     晏沈威
 * @type_name  UCR_user_comment_picture
 * @createtime 2018年9月8日 下午1:45:00
 */

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@TableName(value="ucr_user_comment_picture")
public class UCR_User_Comment_Picture implements Serializable{
	@TableId
	private String pictureID;
	private String ppicture;
	private Long p_userID;
	private Long p_reservationID;
	private String p_orderID;
}
