package CSC1009.wk03_lab;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    //Get and Set for Annual Interest Rate
    public double getAnnalInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
        
    }
    
    //Get and Set for Number Of Years
    public double getNumberOfYears(){
        return numberOfYears;

    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;

    }

    //Get and Set for Loan Amount
    public double getLoanAmount(){
        return loanAmount;

    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;

    }
    
    //Monthly and Total Payment
    public double getMonthlyPayment(){
        double monthlyInterestRate,monthlyPayment;
        monthlyInterestRate = (annualInterestRate /  (12 * 100 ));
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1-(1/(Math.pow(1 + monthlyInterestRate, (numberOfYears * 12)))));
        return monthlyPayment; 

    }

    public double getTotalPayment(){
        double totalPayment;
        totalPayment = (this.getMonthlyPayment() * (numberOfYears * 12));
        return totalPayment;

    }
}
