import java.util.*;
class Rectangle
{
int l,b;
//default constructor
Rectangle()
{
l=0;
b=0;
}
//parameterized constructor
Rectangle(int x,int y)
{
l=x;
b=y;
}
void Perimeter()
{
int peri1;
peri1=2*(l+b);
System.out.println("The Perimeter of the rectangle:"+peri1);
}
}
class peri
{
public static void main(String args[])
{
Rectangle p1=new Rectangle();
Rectangle p2=new Rectangle(15,10);
p1.Perimeter();
p2.Perimeter();
}
}
    
