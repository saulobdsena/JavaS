package CarType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start,finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.print("Pagamento basico " + cr.getInvoice().getBasicPayment() + "\n");
        System.out.print("Imposto: " + cr.getInvoice().getTax() + "\n");
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment() + "\n");
    }
}
