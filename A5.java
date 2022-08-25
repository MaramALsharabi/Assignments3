import java.util.Scanner;

//Write a program that reads three numbers and prints “all the same” if they are all the same,
// “all different” if they are all different, and “neither” otherwise.
public class A5 {
    public static void main(String[] args) {
        System.out.println("please enter three numbers:");
        Scanner x=new Scanner(System.in);
        System.out.print("the first number : ");
        int num1= x.nextInt();
        System.out.print("the second number : ");
        int num2= x.nextInt();
        System.out.print("the third number : ");
        int num3= x.nextInt();
        if (num1==num2&num2==num3)
            System.out.println("All the same");
        else if (num1==num2||num1==num3||num2==num3)
            System.out.println("neither");
        else System.out.println("All different");

    }
}
