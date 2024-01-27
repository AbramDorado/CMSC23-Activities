package ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp;

import java.util.Scanner;

public class Truck extends Vehicle{

    private Double towingCapacity;
    Scanner input = new Scanner(System.in);

    public void displayTruck() {
        System.out.print("Enter make (e.g. Ford,GM,Toyota,Honda,etc.): ");
        make = input.next();
        setMake(make);

        System.out.print("Enter year: ");
        year = input.nextInt();
        setYear(year);

        System.out.print("Enter horsepower (200, 300, or 400): ");
        horsepower = input.nextInt();
        setHorsepower(horsepower);

        System.out.print("Enter towing capacity (0.5, 1.0, 2.0 or 3.0): ");
        towingCapacity = input.nextDouble();
        setTowingCapacity(towingCapacity);

        System.out.println();
        System.out.println("Make: " + getMake());
        System.out.println("Year: " + getYear());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Towing Capacity: " + getTowingCapacity());
        calculateKPL(towingCapacity, horsepower);
    }

    public void calculateKPL(double towingCapacity, int horsepower) {
        kilometersPerLiter = (5000/towingCapacity/horsepower);
        System.out.println(kilometersPerLiter + "  " + "kilometersPerLiter");
    }

    public Double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(Double towingCapacity) {
        while(!(towingCapacity == 0.5 || towingCapacity == 1.0 || towingCapacity == 2.0 || towingCapacity == 3.0)) {
            System.out.print("Wrong input, enter a valid towing capacity: ");
            towingCapacity = input.nextDouble();
        }
        this.towingCapacity = towingCapacity;
    }
}
