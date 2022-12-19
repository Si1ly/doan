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
	
	public void xoaMT(MuonTra mt) {
		QLMT.remove(mt);
	}
	
	public void timMT(int maDGM, int maSM, String tenSM ) {
		for (MuonTra i : QLMT ) {
			if(i.getMaDocgiamuon() == maDGM || i.getMaSachmuon() == maSM || i.getTenSachmuon().indexOf(tenSM) >= 0 ) {
				System.out.println(i);
			}
		}
	}
	
	public void showAll() {
		for (MuonTra i : QLMT) {
			i.toString();
		}
	}
	
}
