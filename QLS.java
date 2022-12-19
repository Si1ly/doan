package DoAn_Model;

import java.util.ArrayList;

public class QLS {
	
	private ArrayList<Sach> QLS;
	
	public QLS() {
		this.QLS = new ArrayList<Sach>();
	}
	
	public QLS(ArrayList<Sach> QLS) {
		this.QLS = QLS;
	}
	
	public void themSach(Sach s) {
		this.QLS.add(s);
	}
	
	public void inDanhSach() {
		for (Sach sach : QLS) {
			System.out.println(sach);
		}
	}
	
	public void timSach(String tenS, int ma, String tenTG ) {
		for (Sach sach : QLS ) {
			if(sach.getTenSach().indexOf(tenS)>=0 || sach.getMaSach() == ma || sach.getTenTacGia().indexOf(tenTG)>=0 ) {
				System.out.println(sach);
			}
		}
	}
	
	public boolean check(Sach s) {
		for( Sach i : QLS) {
			if (s.equals(i)==true) {
				return true;
			}
		}
		return false;
	}

	public void tangSl (int maS, String tenS, int sl) {
		for(Sach i : QLS) {
			if(i.getMaSach()==maS || i.getTenSach().indexOf(tenS)>= 0 ) {
				i.setSoLuong(i.getSoLuong()+sl);
			}
		}
	}
	
	public void giamSl (int maS, String tenS, int sl) {
		for(Sach i : QLS) {
			if(i.getMaSach() == maS || i.getTenSach().indexOf(tenS)>= 0 ) {
				i.setSoLuong(i.getSoLuong()-sl);
			}
		}
	}
	
	public void checkSL ( String tenS , int maS) {
		for(Sach i : QLS) {
			if((i.getTenSach().indexOf(tenS)>=0 || i.getMaSach() == maS) && i.getSoLuong() < 0) {
				System.out.println("Không còn sách");
			}
			if(i.getTenSach().indexOf(tenS)<0 || i.getMaSach() != maS) {
				System.out.println("Không tìm thấy sách");
			}
			else
				System.out.println("Còn sách");
		}
	}
	
	public void xoaSach(Sach s) {
		QLS.remove(s);
	}

	
}	