import java.util.Scanner;
//Write a program that asks the user to enter a month (1 for January, 2 for February, etc.) and then prints the
// number of days in the month. For February, print “28 days”.  Enter a month: 5  30 days
public class A10 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number of the month ");
        int month=x.nextInt();
        if(month==1)
            System.out.println("31 days");
        else if(month==2)
            System.out.println("28 days");
        else if(month==3)
            System.out.println("31 days");
        else if(month==4)
            System.out.println("30 days");
        else if(month==5)
            System.out.println("31 days");
        else if(month==6)
            System.out.println("30 days");
        else if(month==7)
            System.out.println("31 days");
        else if(month==8)
            System.out.println("31 days");
        else if(month==9)
            System.out.println("30 days");
        else if(month==10)
            System.out.println("31 days");
        else if(month==11)
            System.out.println("30 days");
        else if(month==12)
            System.out.println("31 days");
    }
}

