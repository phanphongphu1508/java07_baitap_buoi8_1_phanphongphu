package bai_tap;
import java.util.Scanner;
import java.util.ArrayList;

public class bai_8 {
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
	
		int[] result = xoaPhanTuTrung(mangSo);
		 System.out.print("Mảng: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
	}
	public static int[] xoaPhanTuTrung(int[] mangSo) {
		ArrayList<Integer> mang = new ArrayList<>();
        for (int so : mangSo) {
            if (!mang.contains(so)) {
                mang.add(so);
            }
        }
        int[] mangMoi = new int[mang.size()];
        for (int i = 0; i < mang.size(); i++) {
            mangMoi[i] = mang.get(i);
        }
        return mangMoi;
	}
}  
