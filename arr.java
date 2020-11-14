import java.util.*;
class Shape
{
	public static double area;
	public static void showArea(double ar)
	{
		area=ar;
		System.out.println("The area is "+area);
	}
}
class Circle extends Shape
{
	double rad;
	public static void crcl()
	{
		Shape s=new Shape();
		Scanner sc=new Sanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		rad=sc.nextDouble();
		s.showArea(3.14*rad*rad);
	}
}
	
class Rectangle extends Shape
{
	double ln,bd;
	public static void rect()
	{
		Shape s=new Shape();
		Scanner sc=new Sanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle : ");
		ln=sc.nextDouble();
		bd=sc.nextDouble();
		s.showArea(ln*bd);
	}
}		