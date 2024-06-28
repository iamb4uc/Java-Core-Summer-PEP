public class Bank {
    int deposit(int val) {
        bal += val;
        return bal;
    }
    int withdraw(double val) {
        if (bal < val) {
            return "Insufficient Balance";
        }

        bal -= val;
        return bal;
    }
    String detailsOfAcc() {
        return "Name: " + own + "\nAccount Number: " acc_no + "\nBalance: " + bal;
    }
}
