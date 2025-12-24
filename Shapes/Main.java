package Shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Shapes> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.print("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            String answer = sc.next();

            if(answer.equals("r")) {

                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());


                shapes.add(new Rectangle(color,width,height));
            }
            else if(answer.equals("c")) {

                System.out.print("Radius: ");
                Double radius  = sc.nextDouble();
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());

                shapes.add(new Circle(color, radius));
            }
        }


        for(Shapes s: shapes) {
            System.out.println(s.area());
        }
    }

}
