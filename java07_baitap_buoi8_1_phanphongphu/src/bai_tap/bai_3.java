package bai_tap;

import java.util.Scanner;

public class bai_3 {

	public static void main(String[] args) {
		int phanTu, giaTri;
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
		inMang(phanTu, mangSo);
		xoaPhanTu(phanTu,mangSo);
	}
	// In mảng đã nhập
	public static void inMang(int phanTu, int[] mangSo) {
		System.out.print("Phần tử của mảng: ");
		int phanTuMang;
		for (int i = 0; i < phanTu; i++) {
			phanTuMang =  mangSo[i];
			System.out.printf("%d ", phanTuMang);
		}
		System.out.println("");
	}
	public static void xoaPhanTu(int phanTu, int[] mangSo) {
		Scanner banPhim = new Scanner(System.in);
		//Nhập phần tử cần xóa
		System.out.print("Nhập vào phần tử cần xóa: ");
		int xoaPhanTu = banPhim.nextInt();
		
		// Xóa phần tử
        boolean found = false;
        for (int i = 0; i < phanTu; i++) {
            if (mangSo[i] == xoaPhanTu) {
                // Di chuyển các phần tử phía sau lên
                for (int n = i; n < phanTu - 1; n++) {
                    mangSo[n] = mangSo[n + 1];
                }
                phanTu--; // Giảm kích thước mảng
                found = true;
            }
        }  
        if (found) {
        	System.out.print("Mảng sau khi xóa: ");
        	for (int i = 0; i < phanTu; i++) {
        		System.out.print(mangSo[i] + " ");
        	}
        } else {
        	System.out.print("Giá trị cần xóa không có trong mảng");
        }
	}
}
