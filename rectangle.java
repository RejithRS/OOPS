import java.util.Scanner;
class rect
{
int length,width;
void getdata(int x,int y)
{
length=x;
width=y;
}
void area()
{
double area;
area=length*width;
System.out.println("Area of rectangle is : "+ area);
}
};
class rectangle
{
public static void main(String ar[])
{
rect rect1=new rect();
rect rect2=new rect();
rect1.getdata(10,20);
rect1.area();
rect2.getdata(30,5);
rect2.area();

}
}
