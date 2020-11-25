import java.util.Scanner;

public class Jiyde {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for (int i=1; i<=var; i++) {
            for (int j=1; j<=var; j++) {

                System.out.printf ("%4d",i*j);
            }
            System.out.println();
        }

    }
}
