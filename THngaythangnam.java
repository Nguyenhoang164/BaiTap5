import java.util.Scanner;

public class THngaythangnam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ngay : ");
        int Day = input.nextInt();
        System.out.print("Nhap thang : ");
        int Month = input.nextInt();
        System.out.print("Nhap nam : ");
        int Year = input.nextInt();
        NgayThangNam Ketqua = new NgayThangNam(Day,Month,Year);
        System.out.print(Ketqua.getDay() + "/" + Ketqua.getMonth() + "/" + Ketqua.getYear());

    }
    public static class NgayThangNam {
        int Day, Month, Year;

        public NgayThangNam (int Day, int Month, int Year) {
            this.Day = Day;
            this.Month = Month;
            this.Year = Year;
        }

        public int getDay() {
            return this.Day;
        }

        public int getMonth() {
            return this.Month;
        }

        public int getYear() {
            return this.Year;
        }

    }
}
