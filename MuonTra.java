package DoAn_Model;

import java.util.Date;

public class MuonTra {
	private int maThe;
	private String tenDocgiamuon;
	private String ngayMuon;
	private String ngayTra;
	private int maSachmuon;
	private String tenSachmuon;
	private int soLuongmuon;
	
	
	public MuonTra(int maThe, String tenDocgiamuon, String ngayMuon, String ngayTra, int maSachmuon,
			String tenSachmuon, int soLuongmuon) {
		this.maThe = maThe;
		this.tenDocgiamuon = tenDocgiamuon;
		this.ngayMuon = ngayMuon;
		this.ngayTra = ngayTra;
		this.maSachmuon = maSachmuon;
		this.tenSachmuon = tenSachmuon;
		this.soLuongmuon = soLuongmuon;
	}
	
	public int getmaThe() {
		return maThe;
	}
	public void setmaThe(int maThe) {
		this.maThe = maThe;
	}
	public int getMaSachmuon() {
		return maSachmuon;
	}
	public void setMaSachmuon(int maSachmuon) {
		this.maSachmuon = maSachmuon;
	}
	public String getTenSachmuon() {
		return tenSachmuon;
	}
	public void setTenSachmuon(String tenSachmuon) {
		this.tenSachmuon = tenSachmuon;
	}
	public int getSoLuongmuon() {
		return soLuongmuon;
	}
	public void setSoLuongmuon(int soLuongmuon) {
		this.soLuongmuon = soLuongmuon;
	}
	public String getTenDocgiamuon() {
		return tenDocgiamuon;
	}
	public void setTenDocgiamuon(String tenDocgiamuon) {
		this.tenDocgiamuon = tenDocgiamuon;
	}
	public String getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public String getNgayTra() {
		return ngayTra;
	}
	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}
}
