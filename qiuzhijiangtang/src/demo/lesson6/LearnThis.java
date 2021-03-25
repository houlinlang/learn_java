package demo.lesson6;

public class LearnThis {
	
	int foo;
	String bar;
	
	public LearnThis( int foo, String bar) {
		//用this区别即将创建的对象所有的属性和本方法的形参
		this.foo = foo;
		this.bar = bar;
	}
	
	public void setFoo(int foo) {
		//用this区别此对象的属性和本方法的形参
		this.foo = foo;
	}
	
	public void setFooNew(int foo) {
		//调用此对象内部的方法
		this.setFoo(foo);
	}
	
	public void showInfo() {
		//打印该对象的两个属性
		System.out.println(this.foo + this.bar);
	}
}