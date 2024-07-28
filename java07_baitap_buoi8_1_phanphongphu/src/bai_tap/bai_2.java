package bai_tap;
import java.util.Scanner;

public class bai_2 {
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
			//Nhập giá trị cần tìm
			System.out.print("Nhập vào giá trị cần tìm: ");
			int giaTri = banPhim.nextInt();
			
			dem(mangSo, phanTu, giaTri);
	}
	public static void dem(int[] mangSo, int phanTu, int giaTri) {
		int dem = 0;
		for (int i = 0; i < phanTu; i++) {
			if (mangSo[i] == giaTri) {
				dem++;
			}
		}	
		if (dem == 0) {
			System.out.printf("Giá trị %d không có trong mảng", giaTri);
			return;
		} else {
			System.out.printf("Giá trị %d xuất hiện %d lần trong mảng",giaTri, dem);
		}
	}

}
