package section4;

import java.util.Scanner;

public class Lesson23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int row = sc.nextInt();
		System.out.println("请输入列数：");
		int column = sc.nextInt();
		
		print(row,column);
	}
	
	/*
	输出星形
	1,明确返回值类型：没有具体的返回值类型, void
	2,明确参数列表：int a, int b
	*/
	public static void print(int a, int b) {
		for(int i = 1; i<=a; i++) {			//第1行到a行
			for (int j = 1; j<=b; j++) {		//第1个到b个
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}
