package demo.lesson9;

public class TestInitBlock {
	static StaticBlock sb;
	public static void main(String[] args) {

		//�������̬�Ĵ���飺staticName ִֻ����һ��
	}
	
}

class StaticBlock {
	int age;
	public StaticBlock() {
		System.out.println("���캯��");
		this.age = 1;
	}
	static String name = "staticName";
	static {
		System.out.println("��̬�Ĵ���飺"+name);
	}
}
