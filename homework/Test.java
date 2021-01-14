/**  
 * @Title: Test.java
 * @Description: 
 * @author LYL
 * @date 2021-01-14 13:16:41
 */

package homework;

import java.io.*;

/**
 * @ClassName: Test
 * @Description: 定义一个学生类和一个班级类，在学生类中定义姓名、性别， 班级类定义班级编号属性，实现学生类继承班级类，创建对象并完成属性
 *               赋值，通过对象序列化操作将学生类和班级类写入到文件中，最后 通过反序列化将对象还原到程序中。
 * @author LYL
 * @date 2021-01-14 13:16:41
 */

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// 创建文件对象
		File f = new File("obj.txt");
		// 实例化一个Student对象
		Student stu = new Student("张三", "12345456312", '男');
		// 创建对象流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		// 写出对象
		oos.writeObject(stu);
		// 关闭流
		oos.close();

		ObjectInputStream ois = null;
		Student s = null;
		// 如果存在f对应file文件
		if (f.exists()) {
			// 将f中文件输入程序
			ois = new ObjectInputStream(new FileInputStream(f));
			// 将读出的数据转换成Student类
			s = (Student) ois.readObject();
		}
		// 打印读出的数据
		System.out.println(s);

	}
}
