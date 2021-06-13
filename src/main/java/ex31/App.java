/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex31;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App
{
    public static void main( String[] args )
    {
        evaluateHeartRateChart();
    }

    public static void evaluateHeartRateChart() {
        Scanner input = new Scanner(System.in);
        int resting;
        int age;

        while(true) {
            try {
                System.out.print("Please Enter your resting heart rate: ");
                resting = parseInt(input.nextLine());

                System.out.print("Please Enter your age: ");
                age = parseInt(input.nextLine());

                break;
            }catch(Exception e) {
                System.out.println("Sorry. The input you entered is not valid.");
            }
        }


        System.out.println("\nResting Pulse: " + resting + " Age: " + age + "\n");

        double intensity = 55;

        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96) {
            double target_heart_rate = (((220 - age) - resting) * (intensity/100)) + resting;
            System.out.println(intensity + "%      | " + target_heart_rate + " bpm");
            intensity += 5;
        }
    }
}