import java.util.Scanner;
// Write a program that reads an integer and prints whether it is negative, zero, or positive.
public class A3 {
    public static void main(String[] args) {
        System.out.println("please enter an integer number ");
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        if(x<0) System.out.println("negative");
        else if(x==0) System.out.println("zero");
        else if(x>0) System.out.println("positive");

    }
}