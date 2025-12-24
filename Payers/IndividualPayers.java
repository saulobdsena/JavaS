package Payers;

public class IndividualPayers extends Payers{

    private Double healthExpenditures;

    public IndividualPayers(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double totalTax() {

        double totalPay = 0;

        if (getAnualIncome() < 20000.0) {
            totalPay = getAnualIncome() * 0.15;
        }
        else {
            totalPay = getAnualIncome() * 0.25;
        }
        totalPay -= getHealthExpenditures() * 0.5;
        if (totalPay < 0.0) {
            totalPay = 0.0;
        }
        return totalPay;


    }
}
