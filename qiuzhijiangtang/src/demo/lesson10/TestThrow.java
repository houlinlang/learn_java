package demo.lesson10;

public class TestThrow {
	public static void main(String[] args) {
		Demo demo = new Demo();
		try {
			demo.test();
		}
		// 在 try 语法块中调用函数，后面的 catch 可以 catch 到调用的函数抛出的异常
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class Demo {
	int i;
	// 这里使用了 throws ，将产生的异常抛调用者
	public void test() throws Exception{
		i = 0;
		System.out.println(3/i);
	}
}