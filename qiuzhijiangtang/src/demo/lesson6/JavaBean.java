package demo.lesson6;

/*
	ʵ��һ�� JavaBean:
	 * ˽�е�����
	 * ���Զ�Ӧ�� getter �� setter
*/
public class JavaBean {
	
	private String name; // ����
	private int sex; 	 // �Ա�: 1�� 0Ů
	private int age;	 // ����
	
	/*
	 �༭�������Զ����� getter �� setter
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