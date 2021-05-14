package demo.lesson12;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		
		/* 直接写入文件的完整路径 */
		// 使用 [\\] 作为分隔符
		File f1 = new File("E:\\MyProject\\github\\learn_java\\qiuzhijiangtang\\fileDemo\\test.txt");
		// 使用 [/] 作为分隔符
		File f2 = new File("E:/MyProject/github/learn_java/qiuzhijiangtang/fileDemo/test.txt");
		// 使用 [File.separator] 作为文件分隔符
		File f3 = new File("E:/MyProject"+ File.separator +"github/learn_java/qiuzhijiangtang/fileDemo/test.txt");
		
		/* 将文件路径分为父级和子级两个参数 */
		File f4 = new File("E:/MyProject/github/learn_java/qiuzhijiangtang","fileDemo/test.txt");
	}
}
