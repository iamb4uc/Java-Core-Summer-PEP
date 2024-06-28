import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (n > 0) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i != 0) {
                    System.out.println("Prime");
                }
            }
        }
    }
}
