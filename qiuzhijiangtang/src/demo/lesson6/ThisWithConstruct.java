package demo.lesson6;

public class ThisWithConstruct {
	
	int foo;
	String bar;
	
	ThisWithConstruct(){}
	
	ThisWithConstruct(int foo){
	
		this();//�����˱�����޲ι��췽��
		this.foo = foo;
	}
}