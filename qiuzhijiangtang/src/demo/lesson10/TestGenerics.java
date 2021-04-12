package demo.lesson10;

import java.util.HashSet;
import java.util.Set;

public class TestGenerics {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("name"); // 正常工作
		
//		set.add(1);
		/*
		  编译报错：
		  add()方法被泛型<String>限制了数据类型
		  The method add(String) in the type Set<String> is not applicable for the arguments (int)
		*/
	}
}
