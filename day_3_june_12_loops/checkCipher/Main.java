import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Integer getPrimeNumber(char input, List<Integer> primes) {
        int ofst = input - 'A';
        if (ofst >= 0 && ofst < 26) {
            return primes.get(ofst);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> primes = new ArrayList<>();
        boolean[] nonPrime = new boolean[500];
        for (int i = 2; i <= 100; i++) {
            if (!nonPrime[i]) {
                primes.add(i);
                for (int j = i * 2; j <= 100; j += i) nonPrime[j] = true;
            }
        }

        System.out.println("Enter a letter:");
        String input = s.nextLine().toUpperCase();

        for (char ch : input.toCharArray()) {
            Integer num = getPrimeNumber(ch, primes);
            if (num != null) {
                System.out.print(num);
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
