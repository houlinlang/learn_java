package demo.lesson8;

public class LearnStatic {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//ʵ����һ������
		LearnStaticDemo demo1 = new LearnStaticDemo();
		//��龲̬����
		System.out.println(LearnStaticDemo.count);
		
		//��ʵ������������
		LearnStaticDemo demo2 = new LearnStaticDemo();
		LearnStaticDemo demo3 = new LearnStaticDemo();
		//��龲̬����
		System.out.println(LearnStaticDemo.count);
	}
}

class LearnStaticDemo {
	
	static int count = 0; // ����ͳ�� LearnStaticDemo ��ʵ�����Ĵ���
	
	LearnStaticDemo() {
		LearnStaticDemo.count ++;
	}
}