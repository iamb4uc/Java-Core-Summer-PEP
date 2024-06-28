import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int add[][] = new int[2][2];
        
        System.out.println("Enter elements of matrix 1 [2x2]:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter elements of matrix 2 [2x2]:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = s.nextInt();
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
