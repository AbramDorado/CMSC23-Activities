package ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp;

import java.util.Scanner;

public class Vehicle {

    public String make;
    public Integer year;
    public Integer horsepower;
    public double kilometersPerLiter;

    public Vehicle(String make, int year, int horsepower, double kilometersPerLiter) {
        this.make = make;
        this.year = year;
        this.horsepower = horsepower;
    }

    public Vehicle() {}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    Scanner scan = new Scanner(System.in);
    public void setHorsepower(Integer horsepower) {
        while(!(horsepower == 200 || horsepower == 300 || horsepower == 400)) {
            System.out.print("Wrong input, enter the right horsepower: ");
            horsepower = scan.nextInt();
        }
        this.horsepower = horsepower;
    }
}