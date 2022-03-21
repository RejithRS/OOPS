import java.util.*;
class pattern
{
     public static void main(String args[])
     {
            int i,j,n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the limit");
            n=s.nextInt();
            System.out.println("The pattern is:\n");
            for(i=1;i<=n;i++)
               {
                for(j=1;j<=i;j++)
                    {
                     System.out.print(i+" ");

                    }
                System.out.println(" ");
                }
     }
}
