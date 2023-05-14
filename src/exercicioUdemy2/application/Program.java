package exercicioUdemy2.application;

import exercicioUdemy2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product Data: ");
        System.out.println("Name:");
        product.name = scanner.next();
        System.out.println("Quantity in Stock: ");
        product.quantity = scanner.nextInt();
        System.out.println("Price:");
        product.price = scanner.nextDouble();

        System.out.println();
        System.out.println("Product Data: "+ product);
        System.out.println("Enter the number of products to be added from Stock:");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Update Data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from Stock:");
        quantity = scanner.nextInt();
        product.removeStock(quantity);

        System.out.println("Update Data: " + product);





    }
}
