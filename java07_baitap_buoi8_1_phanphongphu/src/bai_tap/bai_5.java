package bai_tap;
import java.util.ArrayList;
import java.util.Scanner;

public class bai_5 {
	
	public static void main(String[] args) {
		ArrayList<Integer> danhSach = new ArrayList<>();
		int luaChon;
		Scanner banPhim = new Scanner(System.in);
		do {
			System.out.println("Lựa chọn theo số thứ tự bên dưới");
			System.out.println("1. Thêm");
			System.out.println("2. Xóa");
			System.out.println("3. Cập nhật");
			System.out.println("4. In danh sách");
			System.out.println("0. Thoát");
			System.out.print("Lựa chọn: ");
			luaChon = banPhim.nextInt();
			
			switch (luaChon) {
			case 1:
				themPhanTu(danhSach,banPhim);
				break;
			case 2:
				xoaPhanTu(danhSach,banPhim);
				break;
			case 3:
				capNhat(danhSach,banPhim);
				break;
			case 4:
				inDanhSach(danhSach,banPhim);
				return;
			case 0:
				System.out.println("Kết thúc chương trình.");	
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.\n");

				break;
			}
		} while (luaChon != 0);
	}
	// Thêm phần tử
	public static void themPhanTu(ArrayList<Integer> danhSach, Scanner banPhim) {
		System.out.print("Nhập giá trị muốn thêm vào danh sách: ");
		int themPhanTu = banPhim.nextInt();
		danhSach.add(themPhanTu);	
		System.out.printf("Đã thêm %d vào danh sách.\n\n", themPhanTu);
	}
	// Xóa phần tử
	public static void xoaPhanTu(ArrayList<Integer> danhSach, Scanner banPhim) {
		System.out.print("Nhập vị trí phần tử cần xóa: ");
		int viTri = banPhim.nextInt();
		if (viTri >= 0 && viTri < danhSach.size()) {
			int xoaPhanTu = danhSach.remove(viTri);
			System.out.printf("Đã xóa phần tử %d\n\n", xoaPhanTu);
		} else {
			System.out.println("Vị trí không hợp lệ.\n");
		}
	}
	// Cập nhật phần tử
	public static void capNhat(ArrayList<Integer> danhSach, Scanner banPhim) {
		System.out.print("Nhập vị trí của phần tử cần cập nhật: ");
        int viTri = banPhim.nextInt();
        banPhim.nextLine();
        if (viTri >= 0 && viTri < danhSach.size()) {
            System.out.print("Nhập giá trị mới: ");
            int giaTriMoi = banPhim.nextInt();
            danhSach.set(viTri, giaTriMoi);
            System.out.printf("Đã cập nhật phần tử tại vị trí %d thành %d\n\n", viTri, giaTriMoi);
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
	}
	public static void inDanhSach(ArrayList<Integer> danhSach, Scanner banPhim) {
		System.out.print("Danh sách phần tử: ");
		System.out.print(danhSach);
	}
}
