package demo.lesson11;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class TestMyAnnotation {
	
	@MyAnnotation()			//在其他类中使用了自定义的注解（不定义值时候使用默认值）
	String name;
	
	@MyAnnotation(id = 1)	//使用自定义注解并设置了注解的成员变量
	int age;
	
}

@Target(ElementType.FIELD) 			//配置：这个Annotation用于注解 类的属性
@Retention(RetentionPolicy.RUNTIME) //配置：这个Annotation运行于RUNTIME生命周期
@Documented							//配置：在这里生成 JavaDoc
@interface MyAnnotation {
	
	//使用无参数的方式设置了成员变量： 
	public int id() default 0;			//int id = 0;
	public String desc() default ""; 	//String desc = "";
	
}
