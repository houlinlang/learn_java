package demo.lesson9;

public class TestInterface implements MyInterface1,MyInterface2 {
	public static void main(String[] args) {
		System.out.println(MyInterface1.NAME);
	}
}

interface MyInterface1 {
	String NAME = "inter1";
}

interface MyInterface2 {
	String NAME = "inter2";
}