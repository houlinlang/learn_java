package demo.lesson10;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//向 list 中添加元素
		list.add("ele1"); //索引下标0
		list.add("ele2"); //索引下标1
		
		//指定索引位置添加元素
		list.add(1,"ele3");

		//向某个位置插入另一list
		list.addAll(1,list);
		
		//通过索引获取元素
		list.get(1);
		
		//获取 List 长度
		list.size();
		
		//查找元素第一次出现的索引
		list.indexOf("ele1");
		
		//查找元素最后一次出现的索引
		list.lastIndexOf("ele1");
		
		//根据索引移除指定元素
		list.remove(1);
		
		//也可以根据元素内容移除指定元素(只移除一次)
		list.remove("ele1");
		
		//根据指定的索引修改元素
		list.set(4, "ele4");
	}
}
