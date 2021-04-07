package demo.lesson8;

public class LearnCast {
    public static void main(String[] args) {
    	Object obj = "String";		// 从 String 到 Object 实现了自动类型转换
    	String str = (String) obj;  // 从 Object 到 String 使用了强制类型转换
    	System.out.println(str);
    }
}

