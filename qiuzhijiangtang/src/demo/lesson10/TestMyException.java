package demo.lesson10;

public class TestMyException {}

class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	private int idNumber;
	
	//新的构造方法拓展了 id 参数
	public MyException(String message,int id) {
		super(message);
		this.idNumber = id;
	}
	
	public int getId() {
		return this.idNumber;
	}
}