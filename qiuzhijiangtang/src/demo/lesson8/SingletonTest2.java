package demo.lesson8;

/*
  ����ģʽ�ĵڶ���ʵ�֣�����ʽ
*/
public class SingletonTest2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Singleton2 singleObj = Singleton2.getInstance();
		//�۲������Է��֣�����ڶ���ʽ������ʽ�ĵ�����������getInstance()����������ʱ�����ģ�������ʽ�ĵ����������������ʱ�������ġ���
	}

}

class Singleton2 {
	
	//��������˽�л�
	private Singleton2() {}
	//����ָ��������������
	private static Singleton2 singleObj = null;
	
	//���ڷ�����ʵ���� ��������
	public static Singleton2 getInstance() {
		//�����ʱδʵ�������󣬾ʹ���һ��
		if (singleObj == null) {
			singleObj = new Singleton2();
		}
		//�����������ֵ���ղű��������Ķ����ڶ��ڴ��еĵ�ַ
		return singleObj;
	}
}
