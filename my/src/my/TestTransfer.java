package my;

public class TestTransfer {
    public static void swap(int i) {
        i = 6;
        System.out.println("swap ������ i��ֵ�ǣ�"+i);
    }
    public static void main(String[] args) {
        int a = 0;
        swap(a);
        System.out.println("main ���������a��ֵ��"+a);
    }
}