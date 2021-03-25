package demo.lesson7;

/*
	景点订单：
	
	景点名称
	订单编号
	订单总价
*/
public class ScenicOrder extends Order{
	
	 String scenicName; //景点名称
	 
	@SuppressWarnings("unused")
	private void showInfo() {
		 System.out.println(this.orderId+this.scenicName+this.orderPrice);
	 }
}
