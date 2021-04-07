package demo.lesson8;

public class LearnStatic {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//实例化一个对象：
		LearnStaticDemo demo1 = new LearnStaticDemo();
		//检查静态属性
		System.out.println(LearnStaticDemo.count);
		
		//再实例化两个对象：
		LearnStaticDemo demo2 = new LearnStaticDemo();
		LearnStaticDemo demo3 = new LearnStaticDemo();
		//检查静态属性
		System.out.println(LearnStaticDemo.count);
	}
}

class LearnStaticDemo {
	
	static int count = 0; // 用于统计 LearnStaticDemo 被实例化的次数
	
	LearnStaticDemo() {
		LearnStaticDemo.count ++;
	}
}