package section4;

/*
	尝试写方法的重载
*/
public class Lesson26 {

	public static void main(String[] args) {
		System.out.println(isEquals(1.2, 2.2));
	}

	/*
	 * 比较两个数据是否相等 1.返回值：boolen 2.参数：int a, int b
	 */
	public static boolean isEquals(int a, int b) {
		return a == b;
	}

	/*
	 * 比较两个数据是否相等 1.返回值：boolen 2.参数：double a, double b
	 */
	public static boolean isEquals(double a, double b) {
		return a == b;
	}
}
