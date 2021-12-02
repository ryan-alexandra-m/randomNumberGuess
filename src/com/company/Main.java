package com.company;
import java.lang.Math;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main();
    }


    private static void Main() {

            int num = (int) (Math.random() * 100);
            System.out.println("enter a number");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();


            //int i = 15;
            while (guess != num) {
                if (guess > num) {
                    System.out.println("That number is too high");
                    guess = input.nextInt();
                    //i--;

                }
                if (guess < num) {
                    System.out.println("That number is too low");
                    guess = input.nextInt();
                    //i--;
                }
                if (guess == num) {
                    //System.out.println("You did it");
                    break;
                }
            }
            System.out.println("You did it");
            System.out.println("Would you like to play again? (yes/no)");
            input.nextLine();
            String answer = input.nextLine();

            if (Objects.equals(answer, "no")) {
                System.out.println("Ok sure");
            }
            if (Objects.equals(answer, "yes")) {
                System.out.println("playing again");
                Main();

            }

    }

}

