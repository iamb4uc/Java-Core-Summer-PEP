public class Main {
    public double areaSqr(double a) {
        return a*a;
    }

    public static double areaRec(double a, double b) {
        return a*b;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.areaRec(10,2));
        System.out.println(m.areaSqr(30));
    }
}
