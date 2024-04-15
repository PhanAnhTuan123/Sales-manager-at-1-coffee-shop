package model;

import java.sql.Time;

public class CaLamViec {
	private String maCLV;
	private String tenCLV;
	private Time gioBD;
	private Time gioKT;
	private Integer soTien;
	
	public CaLamViec(String maCLV, String tenCLV, Time gioBD, Time gioKT, Integer soTien) {
		super();
		this.maCLV = maCLV;
		this.tenCLV = tenCLV;
		this.gioBD = gioBD;
		this.gioKT = gioKT;
		this.soTien = soTien;
	}

	public String getTenCLV() {
		return tenCLV;
	}

	public void setTenCLV(String tenCLV) {
		this.tenCLV = tenCLV;
	}

	public Time getGioBD() {
		return gioBD;
	}

	public void setGioBD(Time gioBD) {
		this.gioBD = gioBD;
	}

	public Time getGioKT() {
		return gioKT;
	}

	public void setGioKT(Time gioKT) {
		this.gioKT = gioKT;
	}

	public Integer getSoTien() {
		return soTien;
	}

	public void setSoTien(Integer soTien) {
		this.soTien = soTien;
	}

	public String getMaCLV() {
		return maCLV;
	}

	@Override
	public String toString() {
		return "CaLamViec [maCLV=" + maCLV + ", tenCLV=" + tenCLV + ", gioBD=" + gioBD + ", gioKT=" + gioKT
				+ ", soTien=" + soTien + "]";
	}
	
	
}
