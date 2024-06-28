import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the hypotenuse of the triangle");
        int h = s.nextInt();

        System.out.println("Enter the base of the triangle");
        int b = s.nextInt();

        System.out.println("Enter the altitude of the triangle");
        int a = s.nextInt();

        if (h*h == (a*a) + (b*b)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }


    }
}
