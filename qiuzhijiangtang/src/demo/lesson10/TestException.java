package demo.lesson10;

/*
  捕获异常
*/
public class TestException {
	
	public static void main(String[] args) {
		
		int index;
	    int[] intArr = new int[] {1,2,3,4};
	    
		/*
		  下面 try{} 中的代码可能会出现 数组越界异常 || 数字运算异常
		*/
		for(index=0; index<6; index++) {
			try {
				System.out.println(intArr[index]/index-1);
			}
		    // ArithmeticException:数字运算异常
			catch (ArithmeticException exp) {
				System.out.print("运算异常：");
				System.out.println(exp.getMessage());
			}
			// ArrayIndexOutOfBoundsException:数组越界异常
			catch (ArrayIndexOutOfBoundsException exp) {
				System.out.print("数组越界异常：");
				System.out.println(exp.getMessage());
			}
			// 最终无条件执行（不论是否抛出异常）
			finally {
				System.out.println("处理完成："+(index+1));
			}
		}
	}
}