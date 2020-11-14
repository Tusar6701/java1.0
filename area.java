import java.util.*;
class Area
{
    public static double area(double rad)
    {
        return(3.14*rad*rad);
    }
    
    public static int area(int sd)
    {
        return(sd*sd);
    }
    
    public static double area(double ht, double bs)
    {
        return(0.5*bs*ht);
    }
    
    public static void main(String args[])
    {
        double r, b, h, ar;
        int s,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for circle, 2 for square and 3 for triangle : ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter the radius of the circle : ");
                r=sc.nextFloat();
                ar=area(r);
                System.out.println("The area is "+ar);
                break;
            }
            case 2:
            {
                System.out.println("Enter the side of the square : ");
                s=sc.nextInt();
                a=area(s);
                System.out.println("The area is "+a);
                break;
            }
            case 3:
            {
                System.out.println("Enter the base and height of the triangle: ");
                b=sc.nextFloat();
                h=sc.nextFloat();
                ar=area(h,b);
                System.out.println("The area is "+ar);
                break;
            }
            default:
            {
                System.out.println("ERORR!!!");
                break;
            }
        }
        
    }
}