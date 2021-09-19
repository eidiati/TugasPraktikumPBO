import java.util.Scanner;

public class latihan3d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, masing, sisa;
        a = scan.nextInt();
        b = scan.nextInt();
        masing = a / b;
        sisa = a % b;
        scan.close();
        System.out.println("masing-masing " + masing);
        System.out.println("bersisa " + sisa);
    }
}
