package demo.lesson6;

class Person {
	
	// public int age;// ��Ϊ��ʱ��������ǿ��ŵģ����Ա�������������ơ�
	
	//�����Խ��з�װ�����أ�
	private int age;
	
	public void setAge(int a) {
		if ( a >= 0 && a < 200 ) {
			age = a;
		}
		else {
			System.out.println("��������䣺"+a+"����0��150֮��");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void printAge() {
		System.out.println("�ҵ����䣺"+age);
	}
}
