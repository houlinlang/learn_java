package section4;

import java.util.Scanner;

public class Lesson23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int row = sc.nextInt();
		System.out.println("������������");
		int column = sc.nextInt();
		
		print(row,column);
	}
	
	/*
	�������
	1,��ȷ����ֵ���ͣ�û�о���ķ���ֵ����, void
	2,��ȷ�����б�int a, int b
	*/
	public static void print(int a, int b) {
		for(int i = 1; i<=a; i++) {			//��1�е�a��
			for (int j = 1; j<=b; j++) {		//��1����b��
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}
