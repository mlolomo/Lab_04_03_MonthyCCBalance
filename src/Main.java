public class Main {
    public static void main(String[] args) {
        double initialBalance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double interestMonth1 = initialBalance * monthlyInterestRate;
        double balanceAfterMonth1 = initialBalance + interestMonth1;

        double interestMonth2 = balanceAfterMonth1 * monthlyInterestRate;
        double balanceAfterMonth2 = balanceAfterMonth1 + interestMonth2;

        System.out.println("The interest due after one month is $" + interestMonth1);
        System.out.println("The interest due after two months is $" + interestMonth2);
    }
}
