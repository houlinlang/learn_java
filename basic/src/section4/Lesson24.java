package section4;

/*
	���󣺸��ݼ���¼������������Ӧ�ĳ˷���
*/
import java.util.Scanner;
public class Lesson24 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); //����¼�����
		System.out.println("��¼��һ������");
		int number = sc.nextInt();	//��ȡ¼�������
		print99(number);
	}
	/*
		��ӡָ�����ĳ˷���
		1.���أ�void
		2.�����б�int a
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
