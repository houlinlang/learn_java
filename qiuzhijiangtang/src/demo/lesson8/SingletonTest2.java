package demo.lesson8;

/*
  单例模式的第二种实现：懒汉式
*/
public class SingletonTest2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Singleton2 singleObj = Singleton2.getInstance();
		//观察代码可以发现：相比于饿汉式，懒汉式的单例对象是在getInstance()方法被调用时创建的（而饿汉式的单例对象是在类加载时被创建的。）
	}

}

class Singleton2 {
	
	//将构造器私有化
	private Singleton2() {}
	//用于指向单例对象的类变量
	private static Singleton2 singleObj = null;
	
	//用于访问类实例的 公开方法
	public static Singleton2 getInstance() {
		//如果此时未实例化对象，就创建一个
		if (singleObj == null) {
			singleObj = new Singleton2();
		}
		//返回类变量的值：刚才被创建出的对象在堆内存中的地址
		return singleObj;
	}
}
