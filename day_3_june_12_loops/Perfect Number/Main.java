import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int n = s.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) System.out.println("It is a perfect number");
        else System.out.println("Not a perfect number");
    }
}
