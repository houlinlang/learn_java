package demo.lesson9;

public class TestAbstract {

}
class AbstractDemo {
	void say(){}
}
class concreteDemo extends AbstractDemo {
@Override
	void say() {
		super.say();
	}
}