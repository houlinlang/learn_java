package practice;

public class Nine {
	public static void main(String[] args) {
		//9ÐÐ
		for (int i = 1; i<=9; i++) {
			for (int j = 1; j<=i; j++) {
				String k = " ";
				if (i*j < 10) {
					 k = k+" "+" ";
				}
				System.out.print(j+"*"+i+"="+i*j + k);
			}
			System.out.println();
		}
	}
}
