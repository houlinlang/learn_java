package demo.lesson9;

public class TestInitBlock {
	static StaticBlock sb;
	public static void main(String[] args) {

		//输出：静态的代码块：staticName 只执行了一次
	}
	
}

class StaticBlock {
	int age;
	public StaticBlock() {
		System.out.println("构造函数");
		this.age = 1;
	}
	static String name = "staticName";
	static {
		System.out.println("静态的代码块："+name);
	}
}
