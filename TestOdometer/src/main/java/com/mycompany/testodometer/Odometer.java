/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testodometer;

public class Odometer {
private int milesDriven = 0;
private double gallonsConsumed = 0, fuelEfficiency = 0;

    public void reset(){
    milesDriven = 0;
    gallonsConsumed = 0.0;
    }

    public void setFuelEfficiency(double fuelEfficiency){
    this.fuelEfficiency = fuelEfficiency;
    }

    public void addMiles(int miles){
        milesDriven = miles;
        gallonsConsumed = miles/fuelEfficiency;
    }

    public double getGallonsConsumed(){
        return gallonsConsumed;
    }
}

class TestOdometer {
    public static void main(String[] args) {
        Odometer car1 = new Odometer();
        car1.setFuelEfficiency(50);
        System.out.println("The Fuel Effieciency is:");
        car1.addMiles(100);
        System.out.printf("After 100 miles, %.2f gallons used.%n", car1.getGallonsConsumed());
        car1.addMiles(50);
        System.out.printf("After another 50 miles, %.2f gallons used.%n", car1.getGallonsConsumed());

        Odometer car2 = new Odometer();
        car2.setFuelEfficiency(10);
        System.out.println("For your gas guzzler car:");
        car2.addMiles(100);
        System.out.printf("After 100 miles, %.2f gallons used.%n", car2.getGallonsConsumed());
        car2.addMiles(50);
        System.out.printf("After another 50 miles, %.2f gallons used.%n", car2.getGallonsConsumed());
    }
}
