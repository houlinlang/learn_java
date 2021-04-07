package demo.lesson8;

public class TestString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String builderTest = new String("a") + new String("b") + new String("b");
		/*
			字符串常量池:		创建 "a" 和 "b"
			StringBuilder:  在堆中利用 [常量池里的对象] 构造 String对象 "abb", 并返回其地址

            堆内存： --字符串常量池[-(a)---(b)------]-----
                   ----------[对象1:abb]--------------
            栈内存： --builderTest:([对象1:abb]的地址)----
        */
		Boolean a = false;
		
	}
}