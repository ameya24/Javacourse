import java.util.Scanner;
public class Task5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:- \n");
        int lim=sc.nextInt();
        int f=0,s=1;
        int sum,temp;
        System.out.print(f+"\t"+s+"\t");
        for(int i=3;i<=lim;i++)
        {
            sum=f+s;
            f=s;
            s=sum;
            System.out.print(sum+"\t");
        }
    }
    
}