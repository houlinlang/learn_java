package demo.lesson8;

public class LearnStaticMethod {
	public static void main(String[] args) {
		//ֱ�ӵ����෽����
		staticMethodDemo.staticHello();
	}
	
}

class staticMethodDemo {
	static void staticHello() {
		System.out.println("Hello!(from class staticMethodDemo)");
	}
}
