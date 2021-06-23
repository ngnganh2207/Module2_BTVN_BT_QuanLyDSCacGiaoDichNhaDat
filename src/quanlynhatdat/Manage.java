package quanlynhatdat;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    Scanner scanner= new Scanner(System.in);
    ArrayList<GiaoDich> giaoDichArrayList= new ArrayList<>();
    public void addGD(){
        System.out.println("Chọn Info giao dịch cần thêm");
        System.out.println("1. Thêm Giao Dich Nhà");
        System.out.println("2. Thêm Giao Dịch Đất");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                giaoDichArrayList.add(addGDNha());
                break;
            case 2:
                giaoDichArrayList.add(addGDDat());
                break;
        }
    }
    public GiaDichNha addGDNha(){
        //(int maGiaoDich, String ngayGiaoDichDD_MM_YY, double donGia, double dienTich, String diaChiNha, boolean loaiNha)
        System.out.println("Nhập mã giao dịch(int)");
        int maGiaoDich= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày giao dịch String dd/mm/yy");
        String ngayGiaoDichDD_MM_YY= scanner.nextLine();
        System.out.println("Nhập đơn giá (double)");
        double donGia= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập diện tich (double)");
        double dienTich= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập địa chỉ nhà");
        String diaChiNha= scanner.nextLine();
        System.out.println("Nhập loại nhà- true= Nhà cao cấp, false= Nhà thường");
        boolean loaiNha= Boolean.parseBoolean(scanner.nextLine());
        GiaDichNha giaoDichNha= new GiaDichNha(maGiaoDich,ngayGiaoDichDD_MM_YY,donGia,dienTich,diaChiNha,loaiNha);
        return giaoDichNha;
    }
    public GiaoDichDat addGDDat(){
        //(int maGiaoDich, String ngayGiaoDichDD_MM_YY, double donGia, double dienTich, boolean loaiDat)
        System.out.println("Nhập mã giao dịch(int)");
        int maGiaoDich= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày giao dịch String dd/mm/yy");
        String ngayGiaoDichDD_MM_YY= scanner.nextLine();
        System.out.println("Nhập đơn giá (double)");
        double donGia= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập diện tich (double)");
        double dienTich= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập loại đất: true= đất loại A, false= đất loại B,C");
        boolean loaiDat= Boolean.parseBoolean(scanner.nextLine());
        GiaoDichDat giaoDichDat= new GiaoDichDat(maGiaoDich,ngayGiaoDichDD_MM_YY,donGia,dienTich,loaiDat);
        return giaoDichDat;
    }
    public void sumGD(){
        System.out.println(" Chọn loại GĐ nhà or GĐ đất cần tính tổng");
        System.out.println("1. Tính tổng GĐ Nhà");
        System.out.println("2. Tính tổng GĐ Đất");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Tổng gd nhà là: "+ sumGDNha());
                break;
            case 2:
                System.out.println("Tổng gd đất là: "+ sumGDDat());
                break;
        }
    }
    public int sumGDNha(){
        int index=0;
        for(int i=0; i<giaoDichArrayList.size();i++){
            if(giaoDichArrayList.get(i) instanceof GiaDichNha){
                index+=1;
            }else{
                continue;
            }
        }
        return index;
    }
    public int sumGDDat(){
        int index=0;
        for(int i=0; i<giaoDichArrayList.size();i++){
            if(giaoDichArrayList.get(i) instanceof GiaoDichDat){
                index+=1;
            }else{
                continue;
            }
        }
        return index;
    }
    public void deleteGD(){
        System.out.println("Nhập ngày cần xóa giao dịch dd/mm/yy");
        String dateDelete= scanner.nextLine();
        for (GiaoDich gd: giaoDichArrayList){
            if(gd.getNgayGiaoDichDD_MM_YY().equals(dateDelete)){
                giaoDichArrayList.remove(gd);
                // nếu bỏ break để xóa ALL các ngày giống với ngày cần xóa thì báo lỗi.
                break;

            }
        }
    }
    public void sort(){
        SortGiaoDich sortGiaoDich= new SortGiaoDich();
        giaoDichArrayList.sort(sortGiaoDich);
    }

    public void findMaGD(){
        System.out.println("Nhập mã gd cần tìm");
        int maGD= Integer.parseInt(scanner.nextLine());
        int cuoi= giaoDichArrayList.size()-1;
        int dau=0;
        int result = timKiemNhiPhan(giaoDichArrayList,dau,cuoi,maGD);
        if(result==-1)
            System.out.println(" Không tồn tại mã giao dich");
        else
            System.out.println("Mã giao dịch nằm ở vị trí thứ "+result+ " và thông tin cụ thể của giao dịch là "+ giaoDichArrayList.get(result));
    }

    public int timKiemNhiPhan(ArrayList<GiaoDich> giaoDichArrayList,int dau, int cuoi,int maGD) {
        int giua = (dau + cuoi) / 2;
        if (maGD > giaoDichArrayList.get(cuoi).getMaGiaoDich() || maGD < giaoDichArrayList.get(dau).getMaGiaoDich()) {
            return -1;
        } else if (cuoi < dau) {
            return -1;
        } else if (maGD == giaoDichArrayList.get(giua).getMaGiaoDich()) {
            return giua;
        } else if (maGD > giaoDichArrayList.get(giua).getMaGiaoDich()) {
            return timKiemNhiPhan(giaoDichArrayList, giua + 1, cuoi, maGD);
        } else
            return timKiemNhiPhan(giaoDichArrayList, dau, giua - 1, maGD);
    }
}
