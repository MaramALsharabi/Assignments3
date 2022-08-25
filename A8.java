import java.util.Scanner;
// Write a program that reads in the name and salary of an employee. Here the salary will denote an hourly wage,
// such as $9.25. Then ask how many hours the employee worked in the past week. Be sure to accept fractional hours.
// Compute the pay. Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage.
// Print a paycheck for the employee. In your solution, implement a class Paycheck.
public class A8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("please enter your name : ");
        String name=in.next();
        System.out.print("please enter the salary : ");
        double salary=in.nextDouble();
        System.out.print("please enter the number of worked hours : ");
        int hour=in.nextInt();
        if(hour<=40)
            System.out.println("paycheck = "+(salary*hour)+"$");
        else if(hour>40)
            System.out.println("paycheck = "+((salary*40)+((hour-40)*(salary*(150.0/100.0))))+"$");

    }
}


