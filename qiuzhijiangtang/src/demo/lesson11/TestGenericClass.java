package demo.lesson11;

public class TestGenericClass {
	public static void main(String[] args) {
		//实例化时传入泛型的 实参 代入类声明中的泛型
		MyGeneric<String> genericDemo = new MyGeneric<String>();
		
		//类中的 泛型限制 被替换成了具体的 类型限制
		genericDemo.setKey("被泛型限制了类型的参数值");
	}
}

/*
  泛型里面的形参可以任意取名(一般用 T/TYPE)
  泛型起到指代作用
*/
class MyGeneric<TYPE> {
	private TYPE myField;
	
	public TYPE getKey() {
		return this.myField;
	}
	
	public void setKey(TYPE key) {
		this.myField = key;
	}
}