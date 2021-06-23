package quanlynhatdat;

public class GiaoDichDat extends GiaoDich{
    private boolean loaiDat;

    public GiaoDichDat() {
        super();
    }

    public GiaoDichDat(int maGiaoDich, String ngayGiaoDichDD_MM_YY, double donGia, double dienTich, boolean loaiDat) {
        super(maGiaoDich, ngayGiaoDichDD_MM_YY, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public boolean isLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(boolean loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return " Loại Giao Dịch Đất { " +
                "loaiDat=" + loaiDat + super.toString()+
                '}';
    }
}
