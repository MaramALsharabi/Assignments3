import java.util.Scanner;
//Write a program that reads in three integers and prints “in order” if they are sorted in ascending or descending order,
// or “not in order” otherwise. For example,  1 2 5 in order  1 5 2 not in order  5 2 1 in order  1 2 2 in order
public class A7 {
    public static void main(String[] args) {
        System.out.println("please enter three numbers:");
        Scanner x=new Scanner(System.in);
        System.out.print("the first number : ");
        int num1= x.nextInt();
        System.out.print("the second number : ");
        int num2= x.nextInt();
        System.out.print("the third number : ");
        int num3= x.nextInt();
        if(num1<=num2&&num2<=num3||num1>=num2&&num2>=num3)
            System.out.println("IN ORDER");
        else if(num2>num3&&num1<num3||num2<num3&&num1>num3)
            System.out.println("NOT IN ORDER");

    }

}
