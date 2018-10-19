/**
 * 
 */
package cn.wsyjlly.config;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;

/**
 * @author     晏沈威
 * @type_name  DefineFillFields
 * @createtime 2018年9月8日 下午7:25:40
 */
@Configuration
public class DefineFillFields extends MetaObjectHandler {

	/* 
	 * 添加操作
	 */
	@Override
	public void insertFill(MetaObject arg0) {
		Object fieldValue = getFieldValByName("name",arg0);
		if(fieldValue == null) {
			setFieldValByName("name", "wsyjlly", arg0);
			System.out.println("添加操作，name字段为空，默认填充wsyjlly");
		}
	}

	/* 
	 * 修改操作
	 */
	@Override
	public void updateFill(MetaObject arg0) {
		Object fieldValue = getFieldValByName("upicture",arg0);
		if(fieldValue == null) {
			setFieldValByName("upicture", "wsyjlly", arg0);
			System.out.println("修改操作，name字段为空，默认填充wsyjlly");
		}
	}

}
