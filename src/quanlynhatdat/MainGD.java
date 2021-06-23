package quanlynhatdat;

import java.util.Scanner;

public class MainGD {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Manage manage= new Manage();
        do{
            System.out.println("Menu Giao Dịch");
            System.out.println("O. Exit");
            System.out.println("1. Thêm giao dịch");
            System.out.println("2. Hiện thị toàn bộ các thông tin giao dịch nhà đất");
            System.out.println("3. Tính tổng số lượng từng loại giao dịch nhà đất");
            System.out.println("4. Xóa gd theo ngày ");
            System.out.println("5. Tìm giao dịch theo mã GD( sử dụng tìm kiếm nhị phân- Cần thực hiện menu 6 trước");
            System.out.println("6. Sắp xếp theo mã giao dịch");
            System.out.println("7. Tính tiền giao dịch theo ngày");// chưa làm được
            int choose= Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    manage.addGD();
                    break;
                case 2:
                    for(GiaoDich gd: manage.giaoDichArrayList){
                        System.out.println(gd);
                    }
                    break;
                case 3:
                   manage.sumGD();
                    break;
                case 4:
                    manage.deleteGD();
                    break;
                case 5:
                    manage.findMaGD();
                    break;
                case 6:
                    manage.sort();
                    break;
            }
        }while(true);
    }
}
