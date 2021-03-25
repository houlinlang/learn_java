package demo.lesson6;

public class ThisWithConstruct {
	
	int foo;
	String bar;
	
	ThisWithConstruct(){}
	
	ThisWithConstruct(int foo){
	
		this();//调用了本类的无参构造方法
		this.foo = foo;
	}
}