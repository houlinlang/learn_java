package demo.lesson11;

public class TestEnum {
	public static void main(String args[]) {
		
		//取枚举类的一个成员（作为枚举类的一个对象）
		Season spring = Season.SPRING;
		//调用枚举类内对象的方法
		spring.showInfo();
		
	}
}

//enum 关键字
enum Season{
	
	//被简化的成员构造方法（其中调用了枚举类的构造方法），定义了若干成员作为枚举类的类属性。
	//执行动作：（本质上和手动实现的构造方法无异,创建单例的对象）
	// 1. 调用枚举类的私有构造方法创建一个对象
	// 2. 将这个对象置为枚举类的静态属性
	SPRING("春天","1"),
	SUMMER("夏天","2"),
	AUTUMN("秋天","3"),
	WINTER("冬天","4");
	
	//枚举类成员的属性
	private final String name;
	private final String desc;
	
	//枚举类自身的私有构造方法
	private Season (String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	//枚举类成员对外开放的访问方法
	public void showInfo() {
		System.out.println(this.name + ":" + this.desc);
	}
}