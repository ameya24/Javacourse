import java.util.Scanner;
public class Employee
{
    static String name1,name2,name3;
    static int year1,year2,year3;
    static String add1,add2,add3,in;
    public void input()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee1:");
        name1=sc.nextLine();
        System.out.println("Enter year of joining for "+name1+" : ");
        year1=sc.nextInt();
        in=sc.nextLine();
        System.out.println("Enter address for "+name1 +":");
        add1=sc.nextLine();
        in=sc.nextLine();
        System.out.println("Enter name of employee2:");
        name2=sc.nextLine();
        in=sc.nextLine();
        System.out.println("Enter year of joining for "+name2 +":");
        year2=sc.nextInt();
        in=sc.nextLine();
        System.out.println("Enter address for "+name2 +":");
        add2=sc.nextLine();
        in=sc.nextLine();
        System.out.println("Enter name of employee3:");
        name3=sc.nextLine();
        in=sc.nextLine();
        System.out.println("Enter year of joining for "+name3 +":");
        year3=sc.nextInt();
        in=sc.nextLine();
        System.out.println("Enter address for "+name3 +":");
        add3=sc.nextLine();
        in=sc.nextLine();
        System.out.println();
        System.out.println();
    }
    public void display()
    {
        System.out.println("Name \t\t Year of joining \t\t Address:");
        System.out.println(name1+"\t\t"+year1+"\t\t"+"\t\t"+add1);
        System.out.println(name2+"\t\t"+year2+"\t\t"+"\t\t"+add2);
        System.out.println(name3+"\t\t"+year3+"\t\t"+"\t\t"+add3);       
        
     }    
    public static void main()
    {
        Employee obj=new Employee();
        obj.input();
        obj.display();
    }
}