package demo.lesson10;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		
		/*
		 使用 Key 元素实现的 compareTo 方法
		 (Integer、String 内置有 compareTo 方法
		*/
		Map<MyKey,String> testor = new TreeMap<MyKey,String>();
		testor.put(new MyKey("张"),"我姓张");
		testor.put(new MyKey("李"),"我姓李");
		testor.put(new MyKey("孙"),"我姓孙");
		System.out.println(testor);
	}
}

// Key 元素必须 实现 Comparable
class MyKey implements Comparable {
	String name;
	MyKey(String name){
		this.name = name;
	}
	//提供用于排序的方法 compareTo
	@Override
	public int compareTo(Object o) {
		//规则：张排最前面，其他无所谓
		if (this.name == "张") {
			return -1;
		}
		else {
			return 1;
		}
	}
}
