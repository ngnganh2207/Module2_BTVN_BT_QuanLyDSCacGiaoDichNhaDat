package quanlynhatdat;

import java.util.Comparator;

public class GiaoDich {
    private int maGiaoDich;
    private String ngayGiaoDichDD_MM_YY;
    private double donGia;
    private double dienTich;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, String ngayGiaoDichDD_MM_YY, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDichDD_MM_YY = ngayGiaoDichDD_MM_YY;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDichDD_MM_YY() {
        return ngayGiaoDichDD_MM_YY;
    }

    public void setNgayGiaoDichDD_MM_YY(String ngayGiaoDichDD_MM_YY) {
        this.ngayGiaoDichDD_MM_YY = ngayGiaoDichDD_MM_YY;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "Thông Tin Chung Giao Dịch Nhà Đất { " +
                "maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDichDD_MM_YY='" + ngayGiaoDichDD_MM_YY + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }


}
