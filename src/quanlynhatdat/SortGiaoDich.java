package quanlynhatdat;

import java.util.Comparator;

public class SortGiaoDich implements Comparator<GiaoDich> {
    @Override
    public int compare(GiaoDich o1, GiaoDich o2) {
        //Tại sao không thê o1.getMaGiaoDich.compareTo.o2.getMaGiaoDich
        if( o1.getMaGiaoDich()> o2.getMaGiaoDich()){
            return 1;
        }else {
            return -1;
        }
    }
}
