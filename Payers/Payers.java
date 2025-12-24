package Payers;

public abstract class Payers {
    String name;
    Double annualIncome;

    public Payers(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract Double totalTax();

}
