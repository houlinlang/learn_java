package demo.lesson8;

public class LearnCast {
    public static void main(String[] args) {
    	Object obj = "String";		// �� String �� Object ʵ�����Զ�����ת��
    	String str = (String) obj;  // �� Object �� String ʹ����ǿ������ת��
    	System.out.println(str);
    }
}

