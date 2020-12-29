package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
                System.out.println("welcome to our...Gaming World...");
                Scanner scn = new Scanner(System.in);

                System.out.println("may i have your name");
                String name = scn.nextLine();
                System.out.println("Hello "+ name);

                System.out.println("shall we start the Game?");
                System.out.println("\tPress '1' for Yes");
                System.out.println("\tPress '2' for No");

                int answer = scn.nextInt();

                while (answer != 1) {
                    System.out.println("shall we start the Game?");
                    System.out.println("\tPress '1' for Yes");
                    System.out.println("\tPress '2' for No");

                    int ans = scn.nextInt();

                }
                    Random ran = new Random();  // to generate the random no.
                    int x = ran.nextInt(20) + 1;
                    System.out.println("You have only five chances");
                    System.out.println("please guess the nmber: ");
                    int userInput = scn.nextInt();

                    int timesTried = 0;
                    boolean hasWon = false;
                    boolean shouldFinish = false;

                    while (!shouldFinish) {        //while should finish is not equal to true.
                        timesTried++;

                        if (timesTried < 5) {
                            if (userInput == x) {
                                hasWon = true;
                                shouldFinish = true;
                            } else if (userInput > x) {
                                System.out.println("Guess lower");
                                userInput = scn.nextInt();
                            } else {
                                System.out.println("Guess higher");
                                userInput = scn.nextInt();
                            }
                        } else {
                            shouldFinish = true;
                        }
                    }
                if(hasWon){
                    System.out.println("Congratulation!! you have guessed in your " + timesTried + " guess.");

                }else{
                    System.out.println("Game over");
                    System.out.println("The number was: " + x);
                }



    }
}
