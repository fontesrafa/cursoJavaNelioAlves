package model.services;

import model.entities.CarRental;

public class RentalService {

       private Double pricePerDay;
       private Double pricePerHour;

       private BrazilTaxService taxService;

       public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
              this.pricePerDay = pricePerDay;
              this.pricePerHour = pricePerHour;
              this.taxService = taxService;
       }

       public Double getPricePerDay() {
              return pricePerDay;
       }

       public void setPricePerDay(Double pricePerDay) {
              this.pricePerDay = pricePerDay;
       }

       public Double getPricePerHour() {
              return pricePerHour;
       }

       public void setPricePerHour(Double pricePerHour) {
              this.pricePerHour = pricePerHour;
       }

       public void processInvoice(CarRental carRental) {

       }
}