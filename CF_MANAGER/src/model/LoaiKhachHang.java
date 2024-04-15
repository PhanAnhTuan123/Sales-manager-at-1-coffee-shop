package model;

public class LoaiKhachHang {
	private String maLKH;
	private String tenLKH;
	private Integer chietKhau;

	public LoaiKhachHang(String maLKH, String tenLKH, Integer chietKhau) {
		super();
		this.maLKH = maLKH;
		this.tenLKH = tenLKH;
		this.chietKhau = chietKhau;
	}

	public String getMaLKH() {
		return maLKH;
	}

	public String getTenLKH() {
		return tenLKH;
	}

	public void setTenLKH(String tenLKH) {
		this.tenLKH = tenLKH;
	}

	public Integer getChietKhau() {
		return chietKhau;
	}

	public void setChietKhau(Integer chietKhau) {
		this.chietKhau = chietKhau;
	}

	@Override
	public String toString() {
		return "LoaiKhachHang [maLKH=" + maLKH + ", tenLKH=" + tenLKH + ", chietKhau=" + chietKhau + "]";
	}
	
	
}
