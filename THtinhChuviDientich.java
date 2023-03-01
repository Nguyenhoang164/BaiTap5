import java.util.Scanner;

public class THtinhChuviDientich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai : ");
        Double ChieuDai = input.nextDouble();
        System.out.print("Nhap chieu rong : ");
        Double ChieuRong = input.nextDouble();
        ThamChieu ketqua = new ThamChieu(ChieuDai,ChieuRong);
        System.out.println("Thong so ban dau cua hinh la " + ketqua.display());
        System.out.println("Dien tich hinh chu nhat la : " + ketqua.getDientich());
        System.out.println("Chu vi hinh chu nhat la : " + ketqua.getChuvi());

    }

    public static class ThamChieu {
        double ChieuDai, ChieuRong;
        public ThamChieu(double Chieudai, double ChieuRong) {
            this.ChieuDai = Chieudai;
            this.ChieuRong = ChieuRong;
        }
        public double getDientich (){
            return this.ChieuDai * this.ChieuRong;
        }
        public double getChuvi() {
            return (this.ChieuDai + this.ChieuRong) * 2 ;
        }
        public String display () {
            return "Thong so ban dau " + "Chieu Dai " + this.ChieuDai + "Chieu Rong" + this.ChieuRong ;
        }

    }

}
