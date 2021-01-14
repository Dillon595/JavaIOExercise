package homework;

/**  
 * @ClassName: Student
 * @Description: 定义一个学生类和一个班级类，在学生类中定义姓名、性别，
				 班级类定义班级编号属性，实现学生类继承班级类，创建对象并完成属性
				 赋值，通过对象序列化操作将学生类和班级类写入到文件中，最后
				 通过反序列化将对象还原到程序中。
 * @author LYL
 * @date 2021-01-14 11:46:37
*/

public class Student extends Class  {
	
	private static final long serialVersionUID = -9152695056628452696L;
	private String name;
	private char sex;
	
	public Student(String name, String id ,char sex) {
		super(id);
		this.name = name;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}
	
	
	
}
