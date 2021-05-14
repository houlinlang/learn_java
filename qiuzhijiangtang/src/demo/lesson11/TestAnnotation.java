package demo.lesson11;

import java.util.List;
import java.util.ArrayList;


public class TestAnnotation {
	public static void main(String[] args) {
		
		//注释：抑制警告
		@SuppressWarnings(value = { "unused", "rawtypes" })
		List list = new ArrayList();
	}
}

class TestA{ public void demo() {} }

class TestB extends TestA{
	// 注释：重写
	@Override
	public void demo() {
		super.demo();
	}
	
	// 注释：过时
	@Deprecated
	public void bFunc() {}

}