import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principalAmount = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Period (Years): ");
        int periodYears = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / 12 / 100;
        int totalPayments = periodYears * 12;

        double mortgage = principalAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String finalMortgage = currency.format(mortgage);

        System.out.println("--> Mortgage: " + finalMortgage);
    }


}