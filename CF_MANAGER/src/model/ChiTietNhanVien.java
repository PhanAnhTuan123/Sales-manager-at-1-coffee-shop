package model;

public class ChiTietNhanVien {
	private Integer tongSoCaLam;
	private Double luong;
	private NhanVien nhanVien;
	private CaLamViec caLamViec;
	
	public ChiTietNhanVien(Integer tongSoCaLam, Double luong, NhanVien nhanVien, CaLamViec caLamViec) {
		super();
		this.tongSoCaLam = tongSoCaLam;
		this.luong = luong;
		this.nhanVien = nhanVien;
		this.caLamViec = caLamViec;
	}

	public Integer getTongSoCaLam() {
		return tongSoCaLam;
	}

	public void setTongSoCaLam(Integer tongSoCaLam) {
		this.tongSoCaLam = tongSoCaLam;
	}

	public Double getLuong() {
		return luong;
	}

	public void setLuong(Double luong) {
		this.luong = luong;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public CaLamViec getCaLamViec() {
		return caLamViec;
	}

	public void setCaLamViec(CaLamViec caLamViec) {
		this.caLamViec = caLamViec;
	}

	@Override
	public String toString() {
		return "ChiTietNhanVien [tongSoCaLam=" + tongSoCaLam + ", luong=" + luong + ", nhanVien=" + nhanVien
				+ ", caLamViec=" + caLamViec + "]";
	}
	
	
}
