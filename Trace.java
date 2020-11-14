import java.util.Scanner;
class parenthesis
{
	
public static void main(String args[])
{
	Scanner in =new Scanner(System.in);
	System.out.println("Enter number:");
	int s=in.nextInt();
	
		int max=0;
		int t=s,l=0;
	while(t>0)
	{
		l++;
		t=t/10;
	}
	int ar[]=new int[l];
	t=s;
	//System.out.println(l+" "+t+" "+s);
	int h=l;
	while(t>0)
	{
		int r=t%10;
		ar[h-1]=r;
		h--;
		t=t/10;
	}
	//System.out.println(ar[0]);
	
	for(int i=0;i<l;i++)
	{	
		if(max<ar[i])
			max=ar[i];
	}
	//System.out.println("max="+max);
	int c=0,k=0;
	if(ar[0]==max)
	{
		for(int i=0;i<max;i++)
		{
			System.out.print("(");
		}
		System.out.print(ar[0]);
		for(int i=1;i<l;i++)
		{
			for(int j=0;j<max-ar[i];j++)
			System.out.print(")");
			System.out.print(ar[i]);
		}
		
	}
	else 
	{
		for(int i=0;i<max;i++)
		{
			System.out.print("(");
			c++;
			if(c==max)
				break;
			else if(c==ar[k])
				System.out.print(ar[k++]);		
		}
		for(int i=k;i<max;i++)
		{
			for(int j=0;j<max-ar[i];j++)
			System.out.print(")");
			System.out.print(ar[i]);
		}
	}
}
}