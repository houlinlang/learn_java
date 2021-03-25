package my;

public class Test {
	
	public static void swap(DataSwap ds1) {
		ds1.a = 6;
		System.out.println("在swap方法中，ds1.a的值是："+ds1.a);
	}
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		System.out.println("在调用swap方法之前，ds.a的值是："+ds.a);
		swap(ds);
		System.out.println("在调用swap方法之后，ds.a的值是："+ds.a);
	}
}
