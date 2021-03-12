import java.util.Scanner;
public class Task3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice:");
        System.out.print("1 Hi \t 2 Hey \t 3 Hello");
        System.out.println();
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("You said Hi!");
            break;
            case 2:
            System.out.println("You said Hey!");
            break;
            case 3:
            System.out.println("You said Hello!");
            break;
            default:
            System.out.println("Invalid choice");
            break;
            
        }
    }
}