package buoi4;
import java.util.Scanner;
public class ChuyenBay {
	private String hoten;
	private String gioitinh;	
	private String tenchuyenbay;
	private int tuoi;
	private int thoigianbay;
	private int soluongve;
	private double giatien;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTenchuyenbay() {
		return tenchuyenbay;
	}
	public void setTenchuyenbay(String tenchuyenbay) {
		this.tenchuyenbay = tenchuyenbay;
	}
	public int getThoigianbay() {
		return thoigianbay;
	}
	public void setThoigianbay(int thoigianbay) {
		this.thoigianbay = thoigianbay;
	}
	public int getSoluongve() {
		return soluongve;
	}
	public void setSoluongve(int soluongve) {
		this.soluongve = soluongve;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
	public void NhapThongTinChuyenBay() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên khách hàng : ");
		hoten = scanner.nextLine();
		System.out.println("Nhập giới tính : ");
		gioitinh = scanner.nextLine();
		System.out.println("Nhập tên chuyên bay : ");
		tenchuyenbay = scanner.nextLine();
		System.out.println("Nhập loại vé (Nhấn phím 1 2 3 để chọn)");
		System.out.println("1. Cao Cấp");
		System.out.println("2. Thương Gia");
		System.out.println("3. trung cấp");
		int loaive = scanner.nextInt();
		if(loaive == 1) {
			giatien = 10000;
		} else if (loaive == 2) {
			giatien = 5000;
		} else { giatien = 2000;}
		
		System.out.println("Nhập tuôi : ");
		tuoi = scanner.nextInt();
		if (tuoi<6) {
			giatien = giatien * 8 / 10;
		}
		System.out.println("Nhập thời gian bay : ");
		thoigianbay = scanner.nextInt();
		if (thoigianbay>19 || thoigianbay<5) {
			giatien = giatien / 2;
		}
		System.out.println("Nhập số lượng vé mua : ");
		soluongve = scanner.nextInt();
		
	}
	public String toString() {
		
		return "Họ và tên khách hàng : "+this.hoten+"\nGiới tính : "+this.gioitinh+"\nTên chuyến bay: "+this.tenchuyenbay+"\nTuổi : "+this.tuoi+"\nThời gian bay : "+this.thoigianbay+"\nSố lượng vé : "+this.soluongve+"\nGiá tiền : "+this.giatien * this.soluongve;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập sô người mua vé : ");
		int soNguoiMuaVe = sc.nextInt();
		ChuyenBay[] ChuyenBay = new ChuyenBay[soNguoiMuaVe];
		System.out.println("Nhập thông tin của từng người : ");
		for(int i=0; i<soNguoiMuaVe ; i++) {
			System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
        	ChuyenBay chuyenBay = new ChuyenBay();
        	chuyenBay.NhapThongTinChuyenBay();
        	
        	ChuyenBay[i] = chuyenBay;
		}
		System.out.println("Thông tin các hành khách : ");
		
		for(int i=0; i<soNguoiMuaVe ; i++) {
			System.out.println(ChuyenBay[i].toString());
		}
		
		

	}
}
