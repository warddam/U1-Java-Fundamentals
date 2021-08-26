import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class L8 {

    public static void main(String[] args) {


        //Create a Scanner object to read input

        String name;
        int hours;
        double payRate;
        double grossPay;


        //Get the user's name
        System.out.println("What is your name?");
        Scanner read = null;
        name = read.nextLine();

        //Get the number of hours worked
        System.out.println("How many hours did you work?");
        hours = read.nextInt();

        //Get the user's hourly rate
        System.out.println("What is your hourly pay rate?");
        payRate = read.nextDouble();

        //Calculate the gross pay
        grossPay = hours * payRate;

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
        // Bugaboo #1 - Hanging Carriage
        int age;
        ;

        System.out.println("How old are you?");
        age = read.nextInt();

        System.out.println("What is your name?");
        ;

        System.out.println("Hello, " + name + ". You are " + age + "years old.");

        String firstName;
        String lastname;

        System.out.println();
        firstName = read.next();
        lastname = read.nextLine();

        System.out.println("Hello," + firstName + " " + lastname);

    }
    }