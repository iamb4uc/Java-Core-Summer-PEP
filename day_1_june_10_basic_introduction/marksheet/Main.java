import  java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double arr[] = new double[4];
        String sub[] = {"english", "math", "Social science", "Science"};

        System.out.println("Enter marks: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(sub[i] + ": ");
            arr[i] = s.nextDouble();
        }

        double tot = 0;

        for (int i = 0; i < 4; i++) {
            tot += arr[i];
        }

        if (tot/4 >= 40) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] >= 33) {
                    System.out.println("Passed in " + sub[i]);
                } else {
                    System.out.println("Failed in " + sub[i]);
                }
            }
        } else {
            System.out.println("Failed");
        }

    }
}
