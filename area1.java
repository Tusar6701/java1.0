import java.util.*;
class Two_D
{
	public static float cost, ln, bd, ht;
	public static void area(float l, float b)	
	{
		cost=(l*b)*40;
	}
	public static void area(float l, float b, float h)	
	{
		cost=((2*l*b)+(2*b*h)+(2*h*l))*60;
	}
	public static void disp()
	{
		System.out.println("The cost of plastic is Rs."+cost);
	}
}
class Three_D extends Two_D
{
	
    public static void main(String args[])
    {
	Two_D td=new Two_D();
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for sheets and 2 for boxes : ");
	int ch = sc.nextInt();
	switch(ch)
	{
		case 1:
		{
			System.out.println("Enter the length of the sheet : ");
			ln=sc.nextFloat();
			System.out.println("Enter the breadth of the sheet : ");
			bd=sc.nextFloat();
			td.area(ln,bd);
			break;
		}
		case 2:
		{
			System.out.println("Enter the length of the box : ");
			ln=sc.nextFloat();
			System.out.println("Enter the breadth of the box : ");
			bd=sc.nextFloat();
			System.out.println("Enter the height of the box : ");
			ht=sc.nextFloat();
			td.area(ln,bd,ht);
			break;
		}
		default:{System.out.println("ERROR!!!");break;}
	}
	td.disp();

    }
}