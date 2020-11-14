import java.util.*;
class Number
{
    static int nmn, nmx;
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n : ");
	int n=sc.nextInt();
	int num[]=new int[n];
        System.out.println("Enter the numbers :");
        for(int i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	nmx=num[0];
	nmn=num[0];
	for(int i=0;i<n;i++)
	{
		if(num[i]>nmx)
			nmx=num[i];
		if(num[i]<nmn)
			nmn=num[i];
	}
    }
    public static void swap()
    {
        int tp=nmn;
	nmn=nmx;
	nmx=tp;
    }
    public static void display()
    {
        System.out.println("The swapped integers are ");
	System.out.println("Minimum number before swapping " + nmx + " Maximum number before swapping " + nmn+ " Minimum number after swapping " + nmn + " Maximum number after swapping " + nmx);
    }
    
    public static void main(String args[])
    {
        read();
        swap();
        display();
    }
}