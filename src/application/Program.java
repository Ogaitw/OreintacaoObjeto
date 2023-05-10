package application;

import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC,yA, yB, yC;
        Triangule x,y;
        x = new Triangule();
        y = new Triangule();

        System.out.println("Enter the measure of Triangule X; ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measure of Triangule Y; ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();


        System.out.println("Triangule X area= ", areaX);
        System.out.println("Triangule Y area= ", areaY);

        if (areaX > areaY) {
            System.out.println("Large Area  is AreaX") ;
        }else {
            System.out.println("Large Area is AreaY ");
        }



        scanner.close();
    }
}
