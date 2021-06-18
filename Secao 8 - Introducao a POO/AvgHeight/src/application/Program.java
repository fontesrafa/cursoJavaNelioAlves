package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
        double acc = 0;


        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
            acc += vect[i];
        }

        double avg = acc / n;

        System.out.printf("AVERAGE HEIGHT: %.2f", avg);



        sc.close();
    }
}
