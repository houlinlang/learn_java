package demo.lesson10;

import java.util.Map;
import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		
		// 实例化一个 HashMap 类
		Map<Integer,String> map = new HashMap<Integer,String>(); 
		
		// 添加一组 k=>v
		map.put(1, "a");
		map.put(2, "b");
		
		// 获取 map 的 长度
		map.size();
		
		// 根据 key 取 value
		map.get(1);
		
		// 根据 key 移除 k=>v
		map.remove(2);
		
		// 检查 map 是否存在某个 key
		map.containsKey(1);
		
		// 检查 map 是否存在某个 value
		map.containsValue("a");
		
		// 清空 map
		map.clear();
	}
}
