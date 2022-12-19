package DoAn_Model;

import java.util.Date;
import java.util.Objects;

public class DocGia {
	private int maThe;
	private String hoTen;
	private String ngayCap;
	private String ngayHetHan;
	private String diaChi;
	private int CMT;

	public DocGia(int maThe, String hoTen, String ngayCap, String ngayHetHan, String diaChi, int cMT) {
		this.maThe = maThe;
		this.hoTen = hoTen;
		this.ngayCap = ngayCap;
		this.ngayHetHan = ngayHetHan;
		this.diaChi = diaChi;
		CMT = cMT;
	}
	public int hashCode_maDocGia() {
		return Objects.hash(maThe);
	}
	public int getMaThe() {
		return hashCode_maDocGia();
	}
	public void setMaThe(int maThe) {
		this.maThe = maThe;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(String ngayCap) {
		this.ngayCap = ngayCap;
	}
	public String getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getCMT() {
		return CMT;
	}
	public void setCMT(int cMT) {
		CMT = cMT;
	}
	
	
	@Override
	public String toString() {
		return "DocGia [maThe=" + maThe + ", hoTen=" + hoTen + ", ngayCap=" + ngayCap + ", ngayHetHan=" + ngayHetHan
				+ ", diaChi=" + diaChi + ", CMT=" + CMT + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocGia other = (DocGia) obj;
		return CMT == other.CMT && Objects.equals(hoTen, other.hoTen) && maThe == other.maThe;
	}
	
	
}
