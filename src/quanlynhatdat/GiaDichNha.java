package quanlynhatdat;

public class GiaDichNha extends GiaoDich{
    private String diaChiNha;
    private boolean loaiNha;

    public GiaDichNha() {
    }

    public GiaDichNha(int maGiaoDich, String ngayGiaoDichDD_MM_YY, double donGia, double dienTich, String diaChiNha, boolean loaiNha) {
        super(maGiaoDich, ngayGiaoDichDD_MM_YY, donGia, dienTich);
        this.diaChiNha = diaChiNha;
        this.loaiNha = loaiNha;
    }

    public String getDiaChiNha() {
        return diaChiNha;
    }

    public void setDiaChiNha(String diaChiNha) {
        this.diaChiNha = diaChiNha;
    }

    public boolean isLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(boolean loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public String toString() {
        return " Loại Giao Dịch Nhà {" +
                "diaChiNha='" + diaChiNha + '\'' +
                ", loaiNha=" + loaiNha + super.toString()+
                '}';
    }
}
