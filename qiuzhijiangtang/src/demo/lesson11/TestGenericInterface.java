package demo.lesson11;

public class TestGenericInterface {
	public static void main(String[] args) {
		
	}
}

/* 定义泛型接口 */
interface GeneratorInterface<T> {
	T next();
	T behind();
}

/*
  接口声明具体类型
  类中的方法按照接口的泛型规则限制为具体类型
*/
class GeneratorClass<F,T,S> implements GeneratorInterface<T> {
	
	@Override
	//按照接口的泛型规则，返回类型要和接口处泛型实参一致：String
	public T behind() {
		return null;
	}
	//按照接口的泛型规则，返回类型要和接口处泛型实参一致：String
	@Override
	public T next() {
		return null;
	}
}