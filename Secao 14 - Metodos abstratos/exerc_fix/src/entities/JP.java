package entities;

public class JP extends TaxPayer{

       private int employeeNumber;

       public JP() {
              super();
       }

       public JP(String name, double anualRevenue, int employeeNumber) {
              super(name, anualRevenue);
              this.employeeNumber = employeeNumber;
       }

       public int getEmployeeNumber() {
              return employeeNumber;
       }

       public void setEmployeeNumber(int employeeNumber) {
              this.employeeNumber = employeeNumber;
       }

       @Override
       public double taxCalc() {
              if (getEmployeeNumber() > 10) {
                     return getAnualRevenue() * 0.14;
              } else {
                     return getAnualRevenue() * 0.16;
              }
       }
}
