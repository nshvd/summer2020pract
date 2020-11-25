import java.util.Scanner;

public class Jiyde {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        for (int i=1; i<=digit; i++) {
            for (int j=1; j<=digit; j++) {

                System.out.printf ("%4d",i*j);
            }
            System.out.println();
        }

    }
}
