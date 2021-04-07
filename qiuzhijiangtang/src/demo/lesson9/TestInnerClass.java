package demo.lesson9;

public class TestInnerClass {
	public static void main(String[] args) {
		//�� Outer ͬʱ��д SuperA �� SuperB �ķ���
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
			System.out.println("�� Outer���ڲ��� Inner�У���д��superA�ķ���:testA()");
			super.testA();
		}
	}
	
	private class InnerB extends superB{
		@Override
		public void testB() {
			System.out.println("�� Outer���ڲ��� Inner�У���д��superB�ķ���:testB()");
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
