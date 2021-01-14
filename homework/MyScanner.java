package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	public static void main(String[] args) throws IOException {
		
		//获取控制台输入流
		InputStream in =System.in;
		
		//将字节流转换成字符流
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		
		String str="";
		System.out.println("请输入:");
		//读取缓冲区数据 
		while((str=br.readLine())!=null) {
			System.out.println("控制台数据:"+str);
			System.out.println("请输入:");
		}
		
	}
}
