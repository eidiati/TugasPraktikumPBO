import java.util.Scanner;

public class latihan3e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, t, luas;
        a = scan.nextInt();
        t = scan.nextInt();

        luas = a * t / 2;
        scan.close();
        System.out.printf("%.2f", luas);
    }
}