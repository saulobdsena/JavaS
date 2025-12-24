package Payers;

public class CompanyPayers extends Payers {

    private int totalEmployees;

    public CompanyPayers(String name, Double annualIncome, int totalEmployees) {
        super(name, annualIncome);
        this.totalEmployees = totalEmployees;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    @Override
    public Double totalTax(){

        if(totalEmployees > 10){
            return getAnualIncome() * 0.14;
        }
        else return getAnualIncome() * 0.16;
    }
}
