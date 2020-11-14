import java.util.*;
public class ReservationSystem
{
	Scanner sc=new Scanner(System.in);
	static int capacity, c, seat[];
	static void ReservationSystem()
	{
		capacity=0;
		c=0;
	}
	
	static void capAssign()
	{
		System.out.println("Enter the seating capcity of the plane: ");
		capacity=sc.nextInt();
		seat=new int[capacity];
		for(int k=0;i<capacity;i++)
		{
			seat[k]=0;
		}
		
		System.out.println("Enter 1 for smoking and 2 for non-smoking :");
		c=sc.nextInt();
		if(c==1)
		{
			for(int i=0;i<capacity/2;i++)
			{
				if(seat[i]==0)
				{
					mutator(i);
					accessor(i,1);
				}
				else
				{
					System.out.println("Is it acceptable for assignment of the seat to the non-smoking section? [Y/N]");
					char ch=sc.next();
					if(ch==N)
					{
						System.out.println("Next flight leaves in 3 hours.");
					}
					else if(ch==Y)
					{
						for(int j=capacity/2;j<capacity;j++)
						{
							if(seat[j]==0)
							{
								mutator(j);
								accessorI(j,2);
							}
							else
							{
								System.out.println("Next flight leaves in 3 hours.");
							}
						}
					}
					else
					{
						System.out.println("ËRROR!!!");
					}
				}
			}
		}
		else if(c==2)
		{
			for(int j=capacity/2;j<capacity;j++)
			{
				if(seat[j]==0)
				{
					mutator(j);
					accessor(j,3);
				}
				else
				{
					System.out.println("Next flight leaves in 3 hours.");
				}
			}
		
		}

	}
	
	public static int mutator(int b)
	{
		seat[b]=1;
		return 0;
	}
	
	static void accessor(int x, int y)
	{
		System.out.println("Seat number is :"+x);
		if(c==1)
		{
			System.out.println("Smoking section.");
		}
		else
		{
			System.out.println("Non-smoking section.");
		}
	}
	
	public static void main(String args[])
	{
		ReservationSystem r=new ReservationSystem();
		r.capAssign();
		
	}
		
		
}