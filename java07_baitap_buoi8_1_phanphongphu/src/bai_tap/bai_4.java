package bai_tap;
import java.util.Scanner;

public class bai_4 {
	public static void main(String[] args) {
		int phanTu;
		Scanner banPhim = new Scanner(System.in);
		// Nhập số phần tử
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
			
		// Nhập vào phần tử của mảng
		for (int i = 0; i < phanTu; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
			mangSo[i] = banPhim.nextInt();
		}
		demSoLuong(phanTu,mangSo);
	}
	public static void demSoLuong(int phanTu, int[] mangSo) {
		int soAm = 0;
		int soDuong = 0;
		int soKhong = 0;
		for (int i = 0; i < phanTu; i++) {
			if (mangSo[i] < 0) {
				soAm++;
			}
			if (mangSo[i] > 0) {
				soDuong++;
			}
			if (mangSo[i] == 0) {
				soKhong++;
			}	
		}
		if (soAm != 0) {
			System.out.printf("Có %d số âm trong mảng\n", soAm);
		}
		if (soDuong != 0) {
			System.out.printf("Có %d số dương trong mảng\n", soDuong);
		}
		if (soKhong != 0) {
			System.out.printf("Có %d số không trong mảng\n", soKhong);
		}
	}
}
