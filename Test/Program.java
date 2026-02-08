package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
      static void main() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1000.0));
        list.add(new Product("Notebook", 2000.0));
        list.add(new Product("Mouse", 50.0));

        Comparator<Product> comparator = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());

        list.sort(comparator);

        for(Product p : list){
            System.out.println(p.getName());
        }

    }
}
