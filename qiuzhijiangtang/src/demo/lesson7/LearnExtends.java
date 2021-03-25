package demo.lesson7;

public class LearnExtends {
	
}

class SuperClass {
	private int foo;
	public int bar;
	
	public int getFoo() {
		return this.foo;
	}
	
	// 父类自己的方法内部可以直接访问 私有的 foo
	public void info() {
		System.out.println(this.foo);
	}
}

class SubClass extends SuperClass{
	
	// 子类不能直接访问 继承而来的 私有的 foo
	public int subGetFoo() {
//		return this.foo;
		return 0;
	}
	
	/* 
		子类可以通过 继承而来的 public getFoo 来访问 foo
	 	说明 foo 被继承了，只是无法直接访问
	*/
	public void checkFoo() {
		System.out.println(this.getFoo());
	}
}