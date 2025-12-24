package Payers;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Payers> payers = new ArrayList<>();

    System.out.print("Enter the number of payers: ");
    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
        System.out.print("Payer #" + (i + 1) + " data:");

        System.out.print("Individual or Company (i/c) ");
        String answer = sc.next();

        if(answer.equals("i")){
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            double annualIncome = sc.nextDouble();
            System.out.print("Health Insurance: ");
            double healthInsurance = sc.nextDouble();

            payers.add(new IndividualPayers(name, annualIncome, healthInsurance));

        }
        else if(answer.equals("c")){
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            System.out.print("Number of Employees: ");
            int numberOfEmployees = sc.nextInt();

            payers.add(new CompanyPayers(name, annualIncome, numberOfEmployees));
        }

    }
        double totalAll = 0;


        System.out.println("TAXES PAID");
        for(Payers p : payers){

            System.out.println(p.getName() + ": $ " + p.totalTax());
            totalAll += p.totalTax();
        }

        System.out.println("TOTAL: $ " + totalAll);


    }
}
