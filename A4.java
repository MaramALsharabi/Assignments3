import java.util.Scanner;
// Write a program that reads an integer and prints how many digits the number has, by checking whether the
// number is ≥ 10, ≥ 100, and so on. (Assume that all integers are less than ten billion.) If the number is
// negative, first multiply it with –1.
public class A4 {
    public static void main(String[] args) {
        System.out.println("please enetr  an integer number:");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        if (num < 0) {
            num*=-1;
            if (num>=10)
            {
                if (num>=100)
                {
                    if (num>=1000)
                    {
                        if (num>=10000)
                        {
                            if (num>=100000)
                            {
                                if (num>=1000000)
                                {
                                    if (num>=10000000)
                                    {
                                        if (num>=10000000)
                                        {
                                            if (num>=1000000000)
                                            {
                                                System.out.println("ten digits");
                                            }

                                            else System.out.println("nine digits");
                                        }
                                        else System.out.println("eight digits");
                                    }
                                    else System.out.println("seven digits");
                                }
                                else  System.out.println("six digits");
                            }
                            else System.out.println("five digits");
                        }
                        else System.out.println("four digits");
                    }
                    else System.out.println("three digits");
                }
                else System.out.println("two digits");
            }
            else System.out.println("one digit");
        }
        else
        if (num>=10)
        {
            if (num>=100)
            {
                if (num>=1000)
                {
                    if (num>=10000)
                    {
                        if (num>=100000)
                        {
                            if (num>=1000000)
                            {
                                if (num>=10000000)
                                {
                                    if (num>=10000000)
                                    {
                                        if (num>=1000000000)
                                        {
                                            System.out.println("ten digits");
                                        }

                                        else System.out.println("nine digits");
                                    }
                                    else System.out.println("eight digits");
                                }
                                else System.out.println("seven digits");
                            }
                            else  System.out.println("six digits");
                        }
                        else System.out.println("five digits");
                    }
                    else System.out.println("four digits");
                }
                else System.out.println("three digits");
            }
            else System.out.println("two digits");
        }
        else System.out.println("one digit");

    }}
