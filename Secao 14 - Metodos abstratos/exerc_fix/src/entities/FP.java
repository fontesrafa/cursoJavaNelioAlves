package entities;

public class FP extends TaxPayer {

       private double healthCost;

       public FP() {
              super();
       }

       public FP(String name, double anualRevenue, double healthCost) {
              super(name, anualRevenue);
              this.healthCost = healthCost;
       }

       public double getHealthCost() {
              return healthCost;
       }

       public void setHealthCost(double healthCost) {
              this.healthCost = healthCost;
       }

       @Override
       public double taxCalc() {
              if (getAnualRevenue() < 20000) {
                     return getAnualRevenue() * 0.15;
              } else {
                     return getAnualRevenue() * 0.25;
              }
       }
}
