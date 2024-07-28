package bai_tap;
import java.util.Scanner;

public class bai_9 {
	public static void main(String[] args) {
		int phanTu, giaTri;
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
		giaTri = banPhim.nextInt();
		
		demSoLuongPhanTu(phanTu, mangSo, giaTri);
	}
	public static void demSoLuongPhanTu(int phanTu, int[] mangSo, int giaTri) {
		int dem = 0;
		for (int i = 0; i < phanTu; i++) {
			if (mangSo[i] > giaTri) {
				dem++;
			}
		}
		if (dem == 0) {
			System.out.printf("Không có phần tử nào lớn hơn giá trị");
		} else {
			System.out.printf("Số phần tử lớn hơn %d là %d phần tử", giaTri, dem);
		}
	}
}
