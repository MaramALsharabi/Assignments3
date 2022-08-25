import java.util.Scanner;
//Write a program that reads three numbers and prints “increasing” if they are in increasing order, “decreasing”
// if they are in decreasing order, and “neither” other wise. Here, “increasing” means “strictly increasing”,
// with each value larger than its predecessor. The sequence 3 4 4 would not be considered increasing.
public class A6 {
    public static void main(String[] args) {
        System.out.println("please enter three numbers:");
        Scanner x=new Scanner(System.in);
        System.out.print("the first number : ");
        int num1= x.nextInt();
        System.out.print("the second number : ");
        int num2= x.nextInt();
        System.out.print("the third number : ");
        int num3= x.nextInt();
        if(num1<num2&num2<num3)
            System.out.println("increasing");
        else if(num1>num2&num2>num3)
            System.out.println("decreasing");
        else if(num1>=num2||num2>=num3)
            System.out.println("neither");



    }
}
