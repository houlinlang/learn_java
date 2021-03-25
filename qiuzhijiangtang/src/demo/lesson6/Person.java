package demo.lesson6;

class Person {
	
	// public int age;// 因为这时类的属性是开放的，可以被调用者随意控制。
	
	//对属性进行封装和隐藏：
	private int age;
	
	public void setAge(int a) {
		if ( a >= 0 && a < 200 ) {
			age = a;
		}
		else {
			System.out.println("输入的年龄："+a+"不在0到150之间");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void printAge() {
		System.out.println("我的年龄："+age);
	}
}
