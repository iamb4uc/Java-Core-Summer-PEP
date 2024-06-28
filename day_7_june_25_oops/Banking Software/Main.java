import java.util.Scanner;

public class Main {

    String own;
    int acc_no;
    double bal;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank b = new Bank();

        System.out.println("Catalogue:");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Print Account Information");
        System.out.println("4. Exit");
        int n = s.nextInt();

        switch (n) {
            case 1:
                System.out.println("Enter the amount you want to deposit.");
                double val = s.nextInt();
                bal = b.deposit(val):
                System.out.println("Current Balance:" + bal);
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw.");
                double val = s.nextInt();
                bal = b.withdraw(val):
                System.out.println("Withdrawl Successfull!!!\nCurrent Balance:" + bal);
                break;
            default:
                break;
        }
    }
}
