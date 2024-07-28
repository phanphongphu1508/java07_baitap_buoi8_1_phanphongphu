package bai_tap;
import java.util.Scanner;
import java.text.DecimalFormat;
public class bai_6 {
	public static void main(String[] args) {
		int tienGoc;
		double laiSuat, thoiGian;
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập vào số tiền gốc: ");
		tienGoc = banPhim.nextInt();
		
		System.out.print("Nhập lãi suất hàng năm: ");
		laiSuat = banPhim.nextDouble();
		
		System.out.print("Nhập thời gian: ");
		thoiGian = banPhim.nextDouble();
		
		tinhLaiSuat(tienGoc,laiSuat,thoiGian);
	}
	public static void tinhLaiSuat(int tienGoc, double laiSuat, double thoiGian) {
		double laiQuyDoi = laiSuat / 100;
		double tienLai = tienGoc * (1 + laiQuyDoi * thoiGian);
		
		 DecimalFormat dinhDang = new DecimalFormat("#,##0");
	     String dinhDangTienLai = dinhDang.format(tienLai);
		
		System.out.printf("Tổng tiền gốc và lãi là: %sđ", dinhDangTienLai);
	}
}
