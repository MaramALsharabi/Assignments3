import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        System.out.print("please enter the number of the day : ");
        Scanner x=new Scanner(System.in);
        int day=x.nextInt();
        System.out.print("please enter the number of the month : ");
        int month=x.nextInt();
        if(month%3==0&&day>=21)
        {
            if(month==1||month==2||month==3)
                System.out.println("season : spring ");
            else if(month==4||month==5||month==6)
                System.out.println("season : summer ");
            else if(month==7||month==8||month==9)
                System.out.println("season : fall ");
            else if(month==10||month==11||month==12)
                System.out.println("season : winter ");
        }
        else
        {if(month==1||month==2||month==3)
            System.out.println("season : winter ");
        else if (month==4||month==5||month==6)
            System.out.println("season : spring ");
        else if(month==7||month==8||month==9)
            System.out.println("season : summer ");
        else if(month==10||month==11||month==12)
            System.out.println("season : fall ");
        }
    }
}
