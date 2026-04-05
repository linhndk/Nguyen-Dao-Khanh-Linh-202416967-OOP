import java.util.Scanner;

public class nguyendaokhanhlinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Chuong trinh tinh dien tich tam giac (theo cong thuc Heron) ---");

        System.out.print("Nhap chieu dai canh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap chieu dai canh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap chieu dai canh c: ");
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Loi: Do dai 3 canh phai lon hon 0.");
        } else if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Dien tich cua tam giac la: " + area);
        } else {
            System.out.println("Loi: Ba canh vua nhap khong the tao thanh mot tam giac.");
        }

        scanner.close();
    }
}
