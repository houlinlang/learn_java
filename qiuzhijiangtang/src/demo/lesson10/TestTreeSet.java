package demo.lesson10;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(2);
		set.add(6);
		
		System.out.println(set);
		/*
		  输出：
		  [2, 5, 6]
		*/
	}
}
