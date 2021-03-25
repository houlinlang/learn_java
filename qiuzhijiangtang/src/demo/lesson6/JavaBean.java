package demo.lesson6;

/*
	实现一个 JavaBean:
	 * 私有的属性
	 * 属性对应的 getter 和 setter
*/
public class JavaBean {
	
	private String name; // 姓名
	private int sex; 	 // 性别: 1男 0女
	private int age;	 // 年龄
	
	/*
	 编辑器可以自动生成 getter 和 setter
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}