import java.util.Scanner;
import java.lang.Math;
public class BTphuongtrinhbac2 {
    public static class QuadraticEquation {
        double a , b , c ;
        double dellta ;
        public QuadraticEquation (double a , double b , double c){
            this.a = a ;
            this.b = b ;
            this.c = c ;
        }
        private double getDiscriminant(){
            return dellta = (this.b * this.b ) + 4 * this.a * this.c;
        }
        private double getRoot1() {
            dellta = (this.b * this.b ) + 4 * this.a * this.c;
            return (- this.b + Math.sqrt(dellta)) / 2 * this.a;
        }
        private double getRoot2(){
            dellta = (this.b * this.b ) + 4 * this.a * this.c;
            return (- this.b - Math.sqrt(dellta)) / 2 * this.a;
        }
        private double getRoot (){
            return (- this.b) / 2* this.a ;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("chao mung den voi chuong trình tinh nghiem phuong trinh bac 2 1 an ");
            System.out.print("Moi nhap bien a : ");
            double a = input.nextDouble();
            System.out.print("Moi nhap bien b : ");
            double b = input.nextDouble();
            System.out.print("Moi nhap bien c : ");
            double c = input.nextDouble();
            QuadraticEquation kethua = new QuadraticEquation(a,b,c);
             System.out.println("ket qua phuong trinh delta ban dau la : " + kethua.getDiscriminant());
             if (kethua.getDiscriminant() > 0){
                 System.out.println("Nghiem 1 cua phuong trinh la : " + kethua.getRoot1());
                 System.out.println("Nghiem 2 cua phuong trinh la : " + kethua.getRoot2());
             } else if (kethua.getDiscriminant() == 0){
                System.out.print("Phuong trinh co nghiem kep la : " + kethua.getRoot());
             } else {
                 System.out.print("Phuong trinh vo nghiem");
             }
        }
    }
}
