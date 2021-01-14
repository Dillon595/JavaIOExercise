/**  
 * @Title: Class.java
 * @Description: 
 * @author LYL
 * @date 2021-01-14 11:46:00
 */  

package homework;

import java.io.*;

/**
 * 
 * @ClassName: Class
 * @Description: 定义一个学生类和一个班级类，在学生类中定义姓名、性别，
				 班级类定义班级编号属性，实现学生类继承班级类，创建对象并完成属性
				 赋值，通过对象序列化操作将学生类和班级类写入到文件中，最后
				 通过反序列化将对象还原到程序中。
 * @author LYL
 * @date 2021-01-14 12:57:50
 */
public class Class implements Serializable {
	
	private static final long serialVersionUID = 6393330205751969582L;
	String id;
	
	public Class(String id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Class [id=" + id + "]";
	}
	
	
}
