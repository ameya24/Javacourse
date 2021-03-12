import java.util.Scanner;  
public class Array2D 
{  
public static void main(String[] args) 
{  
    int[][] mata = new int[3][3];  
    int[][] matb = new int[3][3];
    int[][] msum = new int[3][3];
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter Elements of matrix A"); 
            System.out.println();  

    for (int i =0;i<3;i++)  
    {  
        for(int j=0;j<3;j++)  
        {
            mata[i][j]=sc.nextInt();  
            System.out.println();  
        }  
    }  
            System.out.println();  

    System.out.println("Matrix A is");  
            System.out.println();  

    for(int i=0;i<3;i++)  
    {   
        System.out.println();  
        for(int j=0;j<3;j++)  
        {  
            System.out.print(mata[i][j]+"\t");  
        }  
    }
            System.out.println();  

    System.out.print("Enter Elements of matrix B");
            System.out.println();  

    for (int i =0;i<3;i++)  
    {  
        for(int j=0;j<3;j++)  
        {
            matb[i][j]=sc.nextInt();  
            System.out.println();  
        }  
    }  
            System.out.println();  

    System.out.println("Matrix B is"); 
            System.out.println();  

    for(int i=0;i<3;i++)  
    {   
        System.out.println();  
        for(int j=0;j<3;j++)  
        {  
            System.out.print(matb[i][j]+"\t");  
        }  
    }     
            System.out.println();  

    System.out.print("Addition of Matrix A and Matrix B is:"); 
            System.out.println();  

    for(int i=0;i<3;i++)  
    {   
        System.out.println();  
        for(int j=0;j<3;j++)  
        {  
            msum[i][j]=mata[i][j]+matb[i][j];
            System.out.print(msum[i][j]+"\t");  
        }  
    }     
}  
}  