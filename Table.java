import java.util.*;
import java.lang.*;
public class Table
{
    public static void main(String [] args)
    {
         int N=0, i=0;
         Scanner Sc=new Scanner(System.in);

         System.out.print("\n Enter a Number :");
         N=Sc.nextInt();

         i = 1;

         while( i<= 10 )
         {
            System.out.println(" " + N + " * " + i + " = " + N * i);
            i++;
         }
         System.out.println("\n N = " + N + "\n i = " + i);
    }
}