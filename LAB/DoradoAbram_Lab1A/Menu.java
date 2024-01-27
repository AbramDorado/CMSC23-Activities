//Remember to add a package name to your files! This is usually auto-generated
package ph.edu.upm.students.DoradoAbram_Lab1A;

//Make sure to import the classes that are under YOUR package
import ph.edu.upm.students.DoradoAbram_Lab1A.cardGame.CardGame;
import ph.edu.upm.students.DoradoAbram_Lab1A.scrambleParagraph.ScrambleParagraph;
import ph.edu.upm.students.DoradoAbram_Lab1A.theValueOfPi.TheValueOfPi;
import ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp.VehicleApp;

import java.util.Scanner;

public class Menu {
    private TheValueOfPi myActivity1;
    private CardGame myActivity2;
    private ScrambleParagraph myActivity3;
    private VehicleApp myActivity4;

    public Menu() {
        myActivity1 = new TheValueOfPi();
        myActivity2 = new CardGame();
        myActivity3 = new ScrambleParagraph();
        myActivity4 = new VehicleApp();
        //other classes
    }

    public void startMenuProgram() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter name: ");
        String name = input.next();

        int option;
        do{
            System.out.println();
            System.out.println("\nHello, " + name);
            System.out.println("Select an option: ");

            System.out.println("\n1 - The Value of Pi");
            System.out.println("2 - Card Game");
            System.out.println("3 - Scramble Paragraph");
            System.out.println("4 - Vehicle Hierarchy");
            System.out.println("5 - Clear screen");
            System.out.println("0 - Exit");

            System.out.print("\nselect: ");
            option = input.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("The Value of Pi\n");
                    myActivity1.showDescription();
                    System.out.print("Would you like to proceed? (y or n): ");
                    String answer = input.next();
                    if (answer.equals("y"))
                        myActivity1.execute();

                }case 2 -> {
                    System.out.println("Card Game\n");
                    myActivity2.showDescription();
                    System.out.print("Would you like to proceed? (y or n): ");
                    String answer = input.next();
                    System.out.println();
                    if (answer.equals("y"))
                        myActivity2.execute();
                }case 3 -> {
                    System.out.println("Scramble Paragraph\n");
                    myActivity3.showDescription();
                    System.out.print("Would you like to proceed? (y or n): ");
                    String answer = input.next();
                    System.out.println();
                    if (answer.equals("y"))
                        myActivity3.execute();
                }case 4 -> {
                    System.out.println("Vehicle Hierarchy\n");
                    myActivity4.showDescription();
                    System.out.print("Would you like to proceed? (y or n): ");
                    String answer = input.next();
                    System.out.println();
                    if (answer.equals("y"))
                        myActivity4.execute();
                }case 5 -> {
                    for(int i = 0; i < 50; i++) {
                        System.out.println();
                    }
                }case 0 -> System.exit(0);
            }
        }while (true);
    }

    public void displayMenu() {
    }
}