package bai_tap;

public class bai_7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Bảng cửu chương " + i);
		    for (int n = 1; n <= 10; n++) {
		    	System.out.println(i + " x " + n + " = " + (i * n));
		    }
		    System.out.println();
		}
	}
}