import java.util.Scanner;

public class latihan3f {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, i, j;
        a = 3;
        b = 3;
        int array[][] = new int[a][b];

        for(i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("");
        for(i = 0; i < b; i++) {
            for(j = 0; j < a; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
