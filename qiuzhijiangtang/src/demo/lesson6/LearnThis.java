package demo.lesson6;

public class LearnThis {
	
	int foo;
	String bar;
	
	public LearnThis( int foo, String bar) {
		//��this���𼴽������Ķ������е����Ժͱ��������β�
		this.foo = foo;
		this.bar = bar;
	}
	
	public void setFoo(int foo) {
		//��this����˶�������Ժͱ��������β�
		this.foo = foo;
	}
	
	public void setFooNew(int foo) {
		//���ô˶����ڲ��ķ���
		this.setFoo(foo);
	}
	
	public void showInfo() {
		//��ӡ�ö������������
		System.out.println(this.foo + this.bar);
	}
}