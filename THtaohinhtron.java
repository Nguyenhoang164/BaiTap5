import java.util.Scanner;

public class THtaohinhtron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh : ");
        double radius = input.nextDouble();
        Hinhtron Ketqua = new Hinhtron(radius);
        System.out.println("Ban kinh ban vua nhap thanh cong la : " + Ketqua.getRadius() + " cm " );
        System.out.print("Dien tich hinh tron la : " + Ketqua.getArea() + " cm2 ");
    }
    public static class Hinhtron{
        double radius ;
        public Hinhtron (double radius){
            this.radius = radius;
        }
        public double getRadius (){
            return this.radius;
        }
        public double getArea(){
            return radius*radius*3.14;
        }
    }

}
