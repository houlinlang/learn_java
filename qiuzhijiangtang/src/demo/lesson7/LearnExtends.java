package demo.lesson7;

public class LearnExtends {
	
}

class SuperClass {
	private int foo;
	public int bar;
	
	public int getFoo() {
		return this.foo;
	}
	
	// �����Լ��ķ����ڲ�����ֱ�ӷ��� ˽�е� foo
	public void info() {
		System.out.println(this.foo);
	}
}

class SubClass extends SuperClass{
	
	// ���಻��ֱ�ӷ��� �̳ж����� ˽�е� foo
	public int subGetFoo() {
//		return this.foo;
		return 0;
	}
	
	/* 
		�������ͨ�� �̳ж����� public getFoo ������ foo
	 	˵�� foo ���̳��ˣ�ֻ���޷�ֱ�ӷ���
	*/
	public void checkFoo() {
		System.out.println(this.getFoo());
	}
}