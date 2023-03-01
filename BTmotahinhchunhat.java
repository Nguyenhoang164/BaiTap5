import java.util.Scanner;

public class BTmotahinhchunhat {
    public static class Retangle {
        double ChieuDai , ChieuRong ;
        public Retangle(double ChieuDai , double ChieuRong) {
            this.ChieuDai = ChieuDai;
            this.ChieuRong = ChieuRong;
        }
        public double getChieuDai(){
            return this.ChieuDai;
        }
        public double getChieuRong(){
            return this.ChieuRong;
        }
        public double getDienTich(){
            return this.ChieuDai*this.ChieuRong;
        }
        public double getChuvi() {
            return (this.ChieuDai + this.ChieuRong) * 2 ;
        }


        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap chieu dai : ");
            double Chieudai = input.nextInt();
            System.out.print("Nhap chieu rong : ");
            double Chieurong = input.nextInt();
            Retangle Ketqua = new Retangle(Chieudai,Chieurong);
            System.out.println("Thong so ban vua nhap la : Chieu dai " + Ketqua.getChieuDai() + " Chieu rong : " + Ketqua.getChieuRong());
            System.out.println("Chu vi hinh chu nhat : " + Ketqua.getChuvi());
            System.out.println("Dien tich hinh chu nhat : " + Ketqua.getDienTich());
            for (int i = 0 ; i < Ketqua.ChieuRong ; i ++){
                for (int j = 1 ; j < Ketqua.ChieuDai ; j ++){
                    System.out.print("*" + " ");
                }
                System.out.println("*");
            }
        }

    }

