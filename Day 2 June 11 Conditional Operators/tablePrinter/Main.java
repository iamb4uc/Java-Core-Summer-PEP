import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(x + " x " + (i+1) + " = " + x*(i+1));
        }
    }
}
