public class Lab_04_03_MonthyCCBalance {
    static void main() {
        double balance = 5000.00;
        double annualRate = 0.17;
        double monthlyRate = annualRate / 12;

        double interestMonth1 = balance * monthlyRate;
        double balanceAfterMonth1 = balance + interestMonth1;

        double interestMonth2 = balanceAfterMonth1 * monthlyRate;
        double balanceAfterMonth2 = balanceAfterMonth1 + interestMonth2;

        IO.println("Starting balance: $" + balance);
        IO.println("Annual interest rate: 17%");
        IO.println("Interest due after month 1: $" + interestMonth1);
        IO.println("Balance after month 1: $" + balanceAfterMonth1);
        IO.println("Interest due after month 2: $" + interestMonth2);
        IO.println("Balance after month 2: $" + balanceAfterMonth2);

    }
}


