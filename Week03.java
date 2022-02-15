package CSC1009.wk03_lab;

import CSC1009.wk03_lab.Loan;
import java.util.Scanner;

public class Week03 {
    public void wk03_question1(){
        double annualInterestRate, loanAmount;
        int numberOfYears;
        java.util.Date loanDate = new java.util.Date();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate,for example, 8.25: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        loanAmount = input.nextDouble();
        System.out.println("The loan was created on " + loanDate);

        Loan payment = new Loan();
        payment.setNumberOfYears(numberOfYears);
        payment.setAnnualInterestRate(annualInterestRate);
        payment.setLoanAmount(loanAmount);
        double monthlyPayment = payment.getMonthlyPayment();
        System.out.format("The monthy payment is %.2f\n", monthlyPayment);
        double totalPayment = payment.getTotalPayment();
        System.out.format("The total payment is %.2f\n", totalPayment);

    }
}
