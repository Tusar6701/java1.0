import java.util.*;
class Rectangle
{
    static double ln, bd, area;
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth : ");
        ln=sc.nextDouble();
        bd=sc.nextDouble();
    }
    public static double calculate()
    {
        area= ln*bd;
        return(area);
    }
    public static void display()
    {
        System.out.println("The area of the rectangle is "+area);
    }
    
    public static void main(String args[])
    {
        read();
        calculate();
        display();
    }
}