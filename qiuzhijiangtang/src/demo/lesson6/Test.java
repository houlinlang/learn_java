package demo.lesson6;

public class Test {
	
	public static void main(String[] args) {
		Person p = new Person(); // 同一个包下的类不用import
		
//		p.age = -100; // 这样的情况，程序的逻辑是正确的，但是不符合业务。
		
		p.setAge(12);
		p.printAge();
	}
}
