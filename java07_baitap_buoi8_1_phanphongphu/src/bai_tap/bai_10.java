package bai_tap;
import java.util.Scanner;

public class bai_10 {
	public static void main(String[] args) {
		int phanTu, n;
		Scanner banPhim = new Scanner(System.in);
		// Nhập số phần tử
		do {
			System.out.print("Nhập vào số phần tử: ");
			phanTu = banPhim.nextInt();
			if (phanTu < 0) {
				System.out.println("Vui lòng nhập số phần tử lớn hơn 0!");
			}
			if (phanTu == 0) {
				System.out.println("Mảng rỗng");
				return;
			}
		} while (phanTu <= 0);
		
		int[] mangSo = new int[phanTu];
		
		// Nhập vào phần tử của mảng
		for (int i = 0; i < phanTu; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
			mangSo[i] = banPhim.nextInt();
		}
		System.out.print("Nhập vào giá trị: ");
		n = banPhim.nextInt();
		
		tinhTong(mangSo,n);
	}
	 public static boolean soNguyenTo(int so) {
	        if (so <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(so); i++) {
	            if (so % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    // Hàm tính tổng các số nguyên tố nhỏ hơn n trong mảng
	    public static void tinhTong(int[] mangSo, int n) {
	        int tong = 0;
	        for (int so : mangSo) {
	            if (so < n && soNguyenTo(so)) {
	                tong += so;
	            }
	        }
	        System.out.printf("Tổng các số nguyên tố nhỏ hơn %d là %d ", n, tong);
	    }
}
