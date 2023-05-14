package application;

import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        Triangule x,y;
        x = new Triangule();
        y = new Triangule();

        System.out.println("Enter the measure of Triangule X; ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();



        System.out.println("Enter the measure of Triangule Y; ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double areaY = y.area();
        double areaX = x.area();


        System.out.printf("Triangule X area= %.4f%n ", areaX);
        System.out.printf("Triangule Y area= %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large Area  is AreaX") ;
        }else {
            System.out.println("Large Area is AreaY ");
        }



        scanner.close();
    }
}
