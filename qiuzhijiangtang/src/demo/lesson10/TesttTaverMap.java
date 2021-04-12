package demo.lesson10;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TesttTaverMap {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "元素1");
		map.put(2, "元素2");
		
		//使用 entrySet 获取 entry 集合
		Set<Entry<Integer, String>> mapEntrySet = map.entrySet();
		
		for (Entry<Integer,String> entry : mapEntrySet) {
			System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
		}
	}
}
