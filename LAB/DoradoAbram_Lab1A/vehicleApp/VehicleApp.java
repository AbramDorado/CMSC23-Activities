package ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp;

import ph.edu.upm.students.DoradoAbram_Lab1A.Menu;

import java.util.Scanner;

public class VehicleApp implements IActivity{

    Scanner input = new Scanner(System.in);
    public void showDescription() {

        System.out.println("PROGRAM DESCRIPTION:");
        System.out.println("This program is a Vehicle App");
        System.out.println("1. Asks the user what vehicle they want to create");
        System.out.println("2. Ask for input for the make, year, horsepower, and (number of passengers or towing capacity)");
        System.out.println("3. Displays all information about a specific bus and truck of your choice.");
        System.out.println("The program will ask the user to press any key to continue. Once the user presses a key, the program will return to the main menu");
        System.out.println();
    }

    public void execute() {
        Bus bus = new Bus();
        Truck truck = new Truck();
        Menu menu = new Menu();

        System.out.println("Choose Vehicle you want to create: ");
        System.out.println("1. Bus");
        System.out.println("2. Truck");
        System.out.print("Enter your choice (1 or 2): ");
        int option = input.nextInt();

        if(option == 1) {
            bus.displayBus();
            pressEnter();
            menu.startMenuProgram(); //go back to menu program
        }
        else if (option == 2){
            truck.displayTruck();
            pressEnter();
            menu.startMenuProgram(); //go back to menu program
        }
    }

    private void pressEnter() {
        System.out.println("Press enter to continue...");
        try {
            System.in.read();
            input.nextLine();
        } catch(Exception e) {}
    }

}
