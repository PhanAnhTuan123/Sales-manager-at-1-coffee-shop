package model;

public class ChiTietHoaDon {
	private Integer soLuong;
	private HangHoa hangHoa;
	private HoaDon hoaDon;

	public ChiTietHoaDon(Integer soLuong, HangHoa hangHoa, HoaDon hoaDon) {
		super();
		this.soLuong = soLuong;
		this.hangHoa = hangHoa;
		this.hoaDon = hoaDon;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public HangHoa getHangHoa() {
		return hangHoa;
	}

	public void setHangHoa(HangHoa hangHoa) {
		this.hangHoa = hangHoa;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [soLuong=" + soLuong + ", hangHoa=" + hangHoa + ", hoaDon=" + hoaDon + "]";
	}

}
