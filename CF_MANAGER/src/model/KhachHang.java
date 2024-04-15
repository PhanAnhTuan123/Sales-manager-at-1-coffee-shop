package model;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private String diaChi;
	private String sdt;
	private Integer diemTL;
	private LoaiKhachHang loaiKH;

	public KhachHang(String maKH, String tenKH, String diaChi, String sdt, Integer diemTL, LoaiKhachHang loaiKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.diemTL = diemTL;
		this.loaiKH = loaiKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Integer getDiemTL() {
		return diemTL;
	}

	public void setDiemTL(Integer diemTL) {
		this.diemTL = diemTL;
	}

	public LoaiKhachHang getLoaiKH() {
		return loaiKH;
	}

	public void setLoaiKH(LoaiKhachHang loaiKH) {
		this.loaiKH = loaiKH;
	}

	public String getMaKH() {
		return maKH;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", sdt=" + sdt + ", diemTL="
				+ diemTL + ", loaiKH=" + loaiKH + "]";
	}

}
