package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectagle width and height: ");
        rectangle.width = sc.nextInt();
        rectangle.height = sc.nextInt();

        System.out.print("AREA = " + rectangle.area() + "\n");
        System.out.printf("PERIMETER = " + rectangle.perimeter() + "\n");
        System.out.printf("DIAGONAL = " + rectangle.diagonal() + "\n");
    }
}
