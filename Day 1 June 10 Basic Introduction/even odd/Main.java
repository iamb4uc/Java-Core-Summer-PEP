public class Main {
    public static void main(String[] args) {
        int a = 30;

        boolean isEven = true;

        for (int i = 0; i < a; i++) {
            isEven = !isEven;
        }

        if (isEven) {
            System.out.println("even");
        }

        if ((a & 1) == 0) {
            System.out.println("even");
        }
    }
}
