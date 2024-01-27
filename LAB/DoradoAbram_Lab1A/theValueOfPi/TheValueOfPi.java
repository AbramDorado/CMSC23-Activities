package ph.edu.upm.students.DoradoAbram_Lab1A.theValueOfPi;

import ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp.IActivity;

public class TheValueOfPi implements IActivity {

    public void showDescription() {

        System.out.println("PROGRAM DESCRIPTION:");
        System.out.println("This Calculates the value of from the infinite series");
        System.out.println("π = 4 − 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...");
        System.out.println("Let 100,000 be the number of terms in the series. Print the approximation of every term");
        System.out.println();
    }

    public void execute() {
        double pi = 4; //first value of pi
        System.out.println(pi);

        double denominator = 3; //set to 3
        for (int i = 1; i < 100000; i++) { //loop through the sequence

            if (i % 2 != 0) //determine if odd or even for + and - sign
                pi -= 4 / denominator;
            else
                pi += 4 / denominator;

            System.out.println(pi); //print the output
            denominator += 2; //increment by 2
        }
    }
}
