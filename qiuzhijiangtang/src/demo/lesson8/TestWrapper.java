package demo.lesson8;

public class TestWrapper {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(2);
		Boolean b = Boolean.valueOf(false);
		// ����
		System.out.println(i.intValue());
		System.out.println(b.booleanValue());
		// �Զ�����
		System.out.println(i);
		System.out.println(b);
	}
}