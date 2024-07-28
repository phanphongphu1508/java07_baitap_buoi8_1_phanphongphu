package bai_tap;
import java.util.Scanner;

public class bai_1 {
	public static void main(String[] args) {
		int phanTu;
		Scanner banPhim = new Scanner(System.in);
		do {
			System.out.print("Nhập vào phần tử: ");
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
			
		for (int i = 0; i <phanTu; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
			mangSo[i] = banPhim.nextInt();
		}
		tinhTong(phanTu, mangSo);
	}
	public static void tinhTong(int phanTu, int[] mangSo) {
		int dem = 0;
		int tong = 0;
		for (int i = 0; i < phanTu; i++) {
			if (mangSo[i] % 2 != 0) {
				tong += mangSo[i];
				dem++;
			}	
		}
		if (dem == 0) {
			System.out.print("Mảng không có số lẻ");
			return;
		} else {
			System.out.print("Tổng số lẻ là " + tong);
		}	
	}
}