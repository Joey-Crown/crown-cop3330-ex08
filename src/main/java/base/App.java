/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

/* Exercise 8 - Pizza Party

Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole
number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of
slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person
should get. If there are leftovers, show the number of leftover pieces.

Example Output

How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value
entered is not numeric.
Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each
person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and
calculate how many full pizzas you need to purchase.
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        Scanner number3 = new Scanner(System.in);

        // input people
        System.out.print("How many people? ");
        int people =  number1.nextInt();

        // input pizzas
        System.out.print("How many pizzas do you have? ");
        int pizzas =  number2.nextInt();

        // input slices
        System.out.print("How many slices per pizza? ");
        int slices =  number3.nextInt();

        // output
        System.out.println(people + " people with " + pizzas + " pizzas (" + (pizzas * slices) + " slices)");
        System.out.println("Each person gets " + ((pizzas * slices) / people) + " pieces of pizza");
        System.out.println("There are " + ((pizzas * slices) % people) + " leftover pieces.");
    }
}
