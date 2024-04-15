package model;

public class LoaiHang {
	private String maLH;
	private String tenLH;
	private String moTa;

	public LoaiHang(String maLH, String tenLH, String moTa) {
		super();
		this.maLH = maLH;
		this.tenLH = tenLH;
		this.moTa = moTa;
	}

	public String getMaLH() {
		return maLH;
	}

	public void setMaLH(String maLH) {
		this.maLH = maLH;
	}

	public String getTenLH() {
		return tenLH;
	}

	public void setTenLH(String tenLH) {
		this.tenLH = tenLH;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		return "LoaiHang [maLH=" + maLH + ", tenLH=" + tenLH + ", moTa=" + moTa + "]";
	}

}
