import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double d = (b * b) - 4 * a * c;
        System.out.println("d: " + d);

        if (d > 0) {
            double root1 = (- b + Math.sqrt(d)) / 2 * a;
            double root2 = (- b - Math.sqrt(d)) / 2 * a;
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
            // double calc1 = a * root1 * root1 + b * root1 + c;
            // double calc2 = a * root2 * root2 + b * root2 + c;
        } else if (d < 0) {
            double real = - b  / 2 * a;
            double img = - Math.sqrt(d) / 2 * a;
            System.out.println("Real: " + real);
            System.out.println("Imaginary: " + img + "i");
        } else {
            double root = - b/(2 * a);
            System.out.println("Root: " + root);
            // double calc = a * root * root + b * root + c;
        }


        // System.out.print("Therefore:\n ax^2 + bx + c = 0 is " );

    }
}
