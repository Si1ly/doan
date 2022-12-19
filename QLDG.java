package DoAn_Model;

import java.util.ArrayList;
import java.util.Date;

//private int maThe;
//private String hoTen;
//private Date ngayCap;
//private Date ngayHetHan;
//private String diaChi;
//private int CMT;
//private int maSach;

public class QLDG {
	private ArrayList<DocGia> QLDG;

	public QLDG() {
		this.QLDG = new ArrayList<DocGia>();
	}
	
	public QLDG(ArrayList<DocGia> qldg) {
		this.QLDG = qldg ;
	}
	
	public void themDG(DocGia p) {
		this.QLDG.add(p);
	}
	
	public void xoaDG(DocGia p) {
		this.QLDG.remove(p);
	}
	
	public boolean check(DocGia p) {
		for (DocGia i : QLDG) {
			if(p.equals(i)== true ) {
				return true;
			}
		}
		return false;
	}
	
	public void showAll() {
		for (DocGia i : QLDG) {
			i.toString();
		}
	}
}
