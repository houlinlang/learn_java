package my;

public class Test {
	
	public static void swap(DataSwap ds1) {
		ds1.a = 6;
		System.out.println("��swap�����У�ds1.a��ֵ�ǣ�"+ds1.a);
	}
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		System.out.println("�ڵ���swap����֮ǰ��ds.a��ֵ�ǣ�"+ds.a);
		swap(ds);
		System.out.println("�ڵ���swap����֮��ds.a��ֵ�ǣ�"+ds.a);
	}
}
