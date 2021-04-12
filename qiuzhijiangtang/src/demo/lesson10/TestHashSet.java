package demo.lesson10;

// Iterator 和 HashSet 类在 java.util 中
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		// 将 set 中的每一个元素赋给 obj
		for ( Object obj : set) {
			System.out.println(obj);
		}
	}
}
