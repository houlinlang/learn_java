package demo.lesson7;

/*
	���㶩����
	
	��������
	�������
	�����ܼ�
*/
public class ScenicOrder extends Order{
	
	 String scenicName; //��������
	 
	@SuppressWarnings("unused")
	private void showInfo() {
		 System.out.println(this.orderId+this.scenicName+this.orderPrice);
	 }
}
