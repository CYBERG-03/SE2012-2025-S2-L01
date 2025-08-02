// it24103439 - Lab 1 - Question 1

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String fname = input.nextLine();
        System.out.print("Enter your Last Name: ");
        String lname = input.nextLine();
        System.out.println("Welcome to the Second Year " + fname + " " + lname);
        input.close();
    }
}
