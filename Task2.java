import java.util.Scanner;
public class Task2
{
    public static void main()
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of minutes:");
        long min=sc.nextLong();
            if(min<0) 
            {
                System.out.println("Invalid Value");
            }
            else
        {
                long hours = min/60;
                long day   = hours/24;
                long years = day/365;
                long remain = day % 365;
                System.out.println(min +" min = "+ years+" y and "+remain +" d");
        }
        }
}