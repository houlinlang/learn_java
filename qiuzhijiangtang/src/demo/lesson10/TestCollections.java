package demo.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		List<MyElement> list = new ArrayList<MyElement>();
		list.add(new MyElement(2));
		list.add(new MyElement(5));
		list.add(new MyElement(3));
		
		// 传入一个 Comparator
		Collections.sort(list,new MyElementComparator());
		
	}

}

// 元素类
class MyElement {
	int elementId;
	MyElement(int id) {
		this.elementId = id;
	}
}

// 为元素类量身打造的 比较工具类
class MyElementComparator implements Comparator {

	@Override
	public int compare(Object ele1, Object ele2) {
		
		// 传入的 Object 向下造型 为 元素的类型
		MyElement myEle1 = (MyElement) ele1;
		MyElement myEle2 = (MyElement) ele2;
		
		if (myEle1.elementId > myEle2.elementId) {
			return 1;
		}
		else if (myEle1.elementId < myEle2.elementId) {
			return -1;
		}
		return 0;
	}
}