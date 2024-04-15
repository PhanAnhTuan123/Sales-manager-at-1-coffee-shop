package model;

public class HangHoa {
	private String maHH;
	private String tenHH;
	private Integer soLuong;
	private Double gia;
	private LoaiHang loaiHang;

	public HangHoa(String maHH, String tenHH, Integer soLuong, Double gia, LoaiHang loaiHang) {
		super();
		this.maHH = maHH;
		this.tenHH = tenHH;
		this.soLuong = soLuong;
		this.gia = gia;
		this.loaiHang = loaiHang;
	}

	public String getMaHH() {
		return maHH;
	}

	public void setMaHH(String maHH) {
		this.maHH = maHH;
	}

	public String getTenHH() {
		return tenHH;
	}

	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Double getGia() {
		return gia;
	}

	public void setGia(Double gia) {
		this.gia = gia;
	}

	public LoaiHang getLoaiHang() {
		return loaiHang;
	}

	public void setLoaiHang(LoaiHang loaiHang) {
		this.loaiHang = loaiHang;
	}

	@Override
	public String toString() {
		return "HangHoa [maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", gia=" + gia + ", loaiHang="
				+ loaiHang + "]";
	}

}
