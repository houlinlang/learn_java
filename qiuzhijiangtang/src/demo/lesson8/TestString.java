package demo.lesson8;

public class TestString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String builderTest = new String("a") + new String("b") + new String("b");
		/*
			�ַ���������:		���� "a" �� "b"
			StringBuilder:  �ڶ������� [��������Ķ���] ���� String���� "abb", ���������ַ

            ���ڴ棺 --�ַ���������[-(a)---(b)------]-----
                   ----------[����1:abb]--------------
            ջ�ڴ棺 --builderTest:([����1:abb]�ĵ�ַ)----
        */
		Boolean a = false;
		
	}
}