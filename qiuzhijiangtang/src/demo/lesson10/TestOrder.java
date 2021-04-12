package demo.lesson10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestOrder {
	public static void main(String[] args) {
		//测试的数据
		Item item1 = new Item(1,"item1info");
		Item item2 = new Item(2,"item2info");
		Item item3 = new Item(3,"item3info");
		Item item4 = new Item(4,"item4info");
		
		//实例化 TreeSet 时向其中放入一个空的 Item
		Set<Item> itemSet = new TreeSet<Item>(new Item());
		itemSet.add(item3);
		itemSet.add(item1);
		itemSet.add(item4);
		itemSet.add(item2);
		
		for (Item i : itemSet) {
			System.out.println(i.id + "  " + i.info);
		}
	}
}

// 被排序的对象：实现 Comparator 接口
class Item implements Comparator<Item>{
	
	int id;
	String info;
	//一个空的构造
	public Item() {}
	//一个带参数的构造（这两个参数在重写的 compare 中被使用）
	public Item(int id, String info) {
		this.id = id;
		this.info = info;
	}
	
	// 重写 compare 方法：依据 id 排序
	@Override
	public int compare(Item o1, Item o2) {
		if (o1.id > o2.id) {
			return 1;
		}
		else if ( o1.id < o2.id ) {
			return -1;
		}
		return 0;
	}
}