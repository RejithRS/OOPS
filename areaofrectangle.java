import java.util.Scanner;
class areaofrectangle
{
      public static void main(String args[])
      {
            int length, breadth, area;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the length");
            length=s.nextInt();
            System.out.println("Enter the breadth");
            breadth=s.nextInt();
            area=length*breadth;
            System.out.println("Area of the Rectangle:"+area);
              
      }
}
