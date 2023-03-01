import java.util.Scanner;

public class BTChuyendoinhietdo {
    public static class NhietDo{
        double NhietDo ;
        public NhietDo (double NhietDo){
            this.NhietDo = NhietDo;
        }
        public double getChuyenDoiCsangF(){
            return (this.NhietDo * 1.8 ) + 32 ;
        }
        public double getChuyenDoiCsangKenvin(){
            return this.NhietDo + 273.15;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap nhiet do : ");
        double NhietDo = input.nextDouble();
        if( NhietDo < -273 ) {
            System.out.print("Nhiet do vuot qua gioi han cho phep !!");
        } else {
            NhietDo ketqua = new NhietDo(NhietDo);
         System.out.println("Menu");
         System.out.println(" 1. chuyen doi C sang F");
         System.out.println(" 2. chuyen doi C sang kevin");
         System.out.println("3. Huy chay chuong trinh");
         int chose = input.nextInt();
         switch (chose){
             case 1 :
                 System.out.println("ket quâ chuyen doi C sang F la : " + ketqua.getChuyenDoiCsangF());
                 break;
             case 2 :
                 System.out.println("Ket qua chuyen doi C sang kenvin : " + ketqua.getChuyenDoiCsangKenvin());
                 break;
             case 3:
                 System.out.close();}

        }
    }
}
