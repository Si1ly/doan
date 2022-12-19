package DoAn_Model;

import java.util.Objects;

public class Sach {
	private int maSach;
	private String tenSach;
	private String tenTacGia;
	private String tenNXB;
	private int soTrang;
	private int giaBan;
	private int maLoaisach;
	private int soLuong;
	
	
	public Sach(int maSach, String tenSach, String tenTacGia, String tenNXB, int soTr, int giaBan,
			int maLoai, int soLuong) {
		
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.tenNXB = tenNXB;
		this.soTrang = soTr;
		this.giaBan = giaBan;
		this.maLoaisach = maLoai;
		this.soLuong = soLuong;
	}


	public Sach() {
		
	}


	public int getMaSach() {
		return maSach;
	}


	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}


	public String getTenSach() {
		return tenSach;
	}


	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}


	public String getTenTacGia() {
		return tenTacGia;
	}


	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}


	public String getTenNXB() {
		return tenNXB;
	}


	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}


	public int getSoTrang() {
		return soTrang;
	}


	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}


	public int getGiaBan() {
		return giaBan;
	}


	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}


	public int getMaLoaisach() {
		return maLoaisach;
	}


	public void setMaLoaisach(int maLoaisach) {
		this.maLoaisach = maLoaisach;
	}


	public int getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", tenSach=" + tenSach + ", tenTacGia=" + tenTacGia + ", tenNXB=" + tenNXB
				+ ", soTrang=" + soTrang + ", giaBan=" + giaBan + ", maLoaisach=" + maLoaisach + ", soLuong=" + soLuong
				+ "]";
	}


	public int hashCode() {
		return Objects.hash(giaBan, maLoaisach, maSach, soLuong, soTrang, tenNXB, tenSach, tenTacGia);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return maLoaisach == other.maLoaisach
				&& Objects.equals(tenNXB, other.tenNXB)
				&& Objects.equals(tenSach, other.tenSach) 
				&& Objects.equals(tenTacGia, other.tenTacGia);
	}
	
}	