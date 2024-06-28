import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[10];

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < 10; i++) {
            if (arr[i] != arr[0]) {
                System.out.println(arr[i]);
            }
        }
    }
}
