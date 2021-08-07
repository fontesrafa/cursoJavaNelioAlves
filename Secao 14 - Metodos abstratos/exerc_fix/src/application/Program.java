package application;

import entities.FP;
import entities.JP;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

       public static void main (String[] args) {

              Locale.setDefault(Locale.US);
              Scanner sc = new Scanner(System.in);

              List<TaxPayer> list = new ArrayList<>();

              System.out.print("Enter the number of taxpayers: ");
              int n = sc.nextInt();

              for (int i=1; i <= n; i++) {
                     System.out.print("Enter the data of #" + i + " taxpayer:");
                     System.out.print("Is the taxpayer a Person or a Company (p/c)? ");
                     char ch = sc.next().charAt(0);
                     System.out.print("Enter the name: ");
                     String name = sc.next();
                     System.out.print("Enter the anual revenue: ");
                     double anualRevenue = sc.nextDouble();
                     if (ch == 'p') {
                            System.out.print("Enter the anual health cost: ");
                            double healthCost = sc.nextDouble();
                            list.add(new FP(name, anualRevenue, healthCost));
                     } else {
                            System.out.print("Enter the number of employees: ");
                            int employeeNumber = sc.nextInt();
                            list.add(new JP(name, anualRevenue, employeeNumber));
                     }
              }
              double sum = 0;
              for (TaxPayer taxPayer : list){
                     System.out.println(taxPayer.getName()+ " : " + taxPayer.getAnualRevenue());
                     sum += taxPayer.taxCalc();
              }
              System.out.print(sum);

              sc.close();
       }


}
