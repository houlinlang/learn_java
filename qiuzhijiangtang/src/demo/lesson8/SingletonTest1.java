package demo.lesson8;

/*
	����ģʽ�ĵ�һ��ʵ�֣�����ʽ
*/
public class SingletonTest1 {

	public static void main(String args[]) {
		//���� ����ģʽ ����������ʵ��
		Singleton1 s1 = Singleton1.getSingle();
		Singleton1 s2 = Singleton1.getSingle();
		//�������ʵ���Ƿ�ָ��ͬһ����ַ��
		if (s1 == s2) {
			System.out.println("s1 is equals to s2!");
		}
		//��ͨ�����Ը�ֵ�ķ�ʽ���һ�£�
		s1.name = "s1";
		System.out.println("s2.name:"+s2.name);
		/*
		  ������Ϣ��
		  s1 is equals to s2!
		  s2.name:s1
		  ˵��s1��s2��ͬһ������
		*/
	}

}

class Singleton1 {
	
	//name�������ں����ļ��
	public String name;
	
	// private ���ƵĹ�����
	private Singleton1() {}
	
	// private ���Ƶ������ ����ָ�򴴽��Ķ���
	private static Singleton1 singleObj = new Singleton1();
	
	// ����װ�Ĺ�����
	public static Singleton1 getSingle() {
		return singleObj;
	}
}


