package demo.lesson8;

/*
	单例模式的第一种实现：饿汉式
*/
public class SingletonTest1 {

	public static void main(String args[]) {
		//创建 单例模式 的两个对象实例
		Singleton1 s1 = Singleton1.getSingle();
		Singleton1 s2 = Singleton1.getSingle();
		//检查两个实例是否指向同一个地址：
		if (s1 == s2) {
			System.out.println("s1 is equals to s2!");
		}
		//再通过属性赋值的方式检查一下：
		s1.name = "s1";
		System.out.println("s2.name:"+s2.name);
		/*
		  返回信息：
		  s1 is equals to s2!
		  s2.name:s1
		  说明s1和s2是同一个对象
		*/
	}

}

class Singleton1 {
	
	//name属性用于后续的检查
	public String name;
	
	// private 限制的构造器
	private Singleton1() {}
	
	// private 限制的类变量 用于指向创建的对象
	private static Singleton1 singleObj = new Singleton1();
	
	// 被包装的构造器
	public static Singleton1 getSingle() {
		return singleObj;
	}
}


