package entities;

public abstract class TaxPayer {
       private String name;
       private double anualRevenue;

       public TaxPayer(){
       }

       public TaxPayer(String name, double anualRevenue) {
              this.name = name;
              this.anualRevenue = anualRevenue;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public double getAnualRevenue() {
              return anualRevenue;
       }

       public void setAnualRevenue(double anualRevenue) {
              this.anualRevenue = anualRevenue;
       }

       public abstract double taxCalc();
}
