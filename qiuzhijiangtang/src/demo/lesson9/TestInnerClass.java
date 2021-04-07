package demo.lesson9;

public class TestInnerClass {
	public static void main(String[] args) {
		//令 Outer 同时重写 SuperA 和 SuperB 的方法
		Outer outer = new Outer();
		outer.testA();
		outer.testB();
	}
}

class Outer {
	
	public void testA() {
		new InnerA().testA();
	}
	
	public void testB() {
		new InnerB().testB();
	}
	
	private class InnerA extends superA{
		@Override
		public void testA() {
			System.out.println("在 Outer的内部类 Inner中，重写了superA的方法:testA()");
			super.testA();
		}
	}
	
	private class InnerB extends superB{
		@Override
		public void testB() {
			System.out.println("在 Outer的内部类 Inner中，重写了superB的方法:testB()");
			super.testB();
		}
	}
}

class superA {
	public void testA() {}
}

class superB {
	public void testB() {}
}
