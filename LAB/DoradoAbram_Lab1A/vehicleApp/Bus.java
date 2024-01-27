package ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp;

import java.util.Scanner;

public class Bus extends Vehicle{

    private Integer numOfPassengers;
    Scanner input = new Scanner(System.in);

    public void displayBus() {
        System.out.print("Enter make (e.g. Ford,GM,Toyota,Honda,etc.): ");
        make = input.next();
        setMake(make);

        System.out.print("Enter year: ");
        year = input.nextInt();
        setYear(year);

        System.out.print("Enter horsepower (200, 300, or 400): ");
        horsepower = input.nextInt();
        setHorsepower(horsepower);

        System.out.print("Enter number of passengers (1-50): ");
        numOfPassengers = input.nextInt();
        setNumOfPassengers(numOfPassengers);

        System.out.println();
        System.out.println("Make: " + getMake());
        System.out.println("Year: " + getYear());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Number of passengers: " + getNumOfPassengers());
        calculateKPL(numOfPassengers, horsepower);
    }

    public void calculateKPL(int numOfPassengers, int horsepower) {
        kilometersPerLiter = 10000/numOfPassengers/horsepower;
        System.out.println(kilometersPerLiter + "  " + "kilometersPerLiter");
    }

    public Integer getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(Integer numOfPassengers) {
        while (numOfPassengers < 1 || numOfPassengers > 50) {
            System.out.print("Wrong input, enter a valid passenger range: ");
            numOfPassengers = input.nextInt();
        }
        this.numOfPassengers = numOfPassengers;
    }
}
