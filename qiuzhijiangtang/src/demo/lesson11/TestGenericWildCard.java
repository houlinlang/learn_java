package demo.lesson11;

import java.util.List;

public class TestGenericWildCard {
	public static void main(String[] args) {
		
	}
}

class WildCard {
	// 不确定 List 元素的类型
	public void test(List<?> list) {
		
	}
}