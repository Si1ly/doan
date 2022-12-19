package DoAn_Model;

import java.util.ArrayList;

//private int maDocgiamuon;
//private int maSachmuon;
//private String tenSachmuon;
//private int soLuongmuon;

public class QLMT {
	private ArrayList<MuonTra> QLMT;
	
	public QLMT() {
		this.QLMT = new ArrayList<MuonTra>();
	}
	
	public QLMT(ArrayList<MuonTra> qlmt) {
		this.QLMT = qlmt;
	}
	
	public void themMT(MuonTra mt) {
		QLMT.add(mt);
	}
	
	public void xoaMT(int maThe, int maSM, String tenSM, String tenDGM) {
		for (MuonTra mt : QLMT ) {
			if(mt.getmaThe() == maThe || mt.getMaSachmuon() == maSM || mt.getTenSachmuon().indexOf(tenSM) >= 0 || mt.getTenDocgiamuon().indexOf(tenDGM) >= 0 ) {
				QLMT.remove(mt);
			}
		}
	}
	
	public void timMT(int maThe, int maSM, String tenSM, String tenDGM ) {
		for (MuonTra mt : QLMT ) {
			if(mt.getmaThe() == maThe || mt.getMaSachmuon() == maSM || mt.getTenSachmuon().indexOf(tenSM) >= 0 || mt.getTenDocgiamuon().indexOf(tenDGM) >= 0 ) {
				System.out.println(mt);
			}
		}
	}
	
	public void showAll() {
		for (MuonTra i : QLMT) {
			i.toString();
		}
	}
	
	public void get_ngayDinhTra(int maThe, int maSM, String tenSM, String tenDGM) {
		for (MuonTra mt : QLMT ) {
			if(mt.getmaThe() == maThe || mt.getMaSachmuon() == maSM || mt.getTenSachmuon().indexOf(tenSM) >= 0 || mt.getTenDocgiamuon().indexOf(tenDGM) >= 0 ) {
				System.out.println(mt.getNgayTra());
			}
		}
	}
	
}
