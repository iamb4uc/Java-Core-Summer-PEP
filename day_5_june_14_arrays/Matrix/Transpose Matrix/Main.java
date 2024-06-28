import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][i] = s.nextInt();
            }
        }

        System.out.println("Original:");
        for (int i = 0; i < 2; i++) {
            System.out.println("[");
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][i] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Transposed:");
        for (int i = 0; i < 2; i++) {
            System.out.println("[");
            for (int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("]");
        }
    }
}
