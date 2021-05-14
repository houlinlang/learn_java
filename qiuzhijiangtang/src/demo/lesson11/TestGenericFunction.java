package demo.lesson11;

public class TestGenericFunction {
	public static void main(String[] args) {
		GenericFun gene = new GenericFun();
		//泛型方法的返回类型和参数类型在方法被调用时兑现
		gene.Generic("String");
		gene.Generic(42);
	}
}

class GenericFun {
	/*
	  方法种定义泛型
	  1. 泛型可以用在返回类型处
	  2. 泛型可以指代返回类型和形参类型
	*/
	public <T1,T2> T1 Generic(T2 t) {
		T1 t1;
		System.out.println(t);
		t1 = null;
		return t1;
	}
}