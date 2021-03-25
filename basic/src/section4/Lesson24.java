package section4;

/*
	需求：根据键盘录入的数据输出对应的乘法表
*/
import java.util.Scanner;
public class Lesson24 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); //键盘录入对象
		System.out.println("请录入一个整数");
		int number = sc.nextInt();	//获取录入的整数
		print99(number);
	}
	/*
		打印指定规格的乘法表
		1.返回：void
		2.参数列表：int a
	*/
	private static void print99(int a) {
		for (int i=1; i<=a; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+ "\t");
			}
			System.out.println();
		}
	}
}
