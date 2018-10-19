/**
 * 
 */
package cn.wsyjlly.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author     晏沈威
 * @type_name  ListTool
 * @createtime 2018年9月8日 下午6:45:39
 */
public class ListTool {
	public static  List<Object> appendToResult(Object... args) {
		List<Object> list = new ArrayList<Object>();
		for (Object object : args) {
			list.add(object);
		}
		return list;
	}
}
