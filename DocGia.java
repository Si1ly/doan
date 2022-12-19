package DoAn_Model;

import java.util.Date;
import java.util.Objects;

public class DocGia {
	private int maThe;
	private String hoTen;
	private Date ngayCap;
	private Date ngayHetHan;
	private String diaChi;
	private int CMT;
	private int maSach;
	
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public int hashCode_maDocGia() {
		return Objects.hash(maThe);
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
	public Date getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
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
