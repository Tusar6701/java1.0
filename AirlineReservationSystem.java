import java.util.*;
class ReservationSystem
{
	static Scanner sc=new Scanner(System.in);
	private static int n;
	private static int sCh[];
	ReservationSystem()
	{
		n=0;
	}
	public void input()
	{
		System.out.println("Enter the capacity of the plane : ");
		n=sc.nextInt();
		sCh=new int[n];
	}
	public int setSeatVal(int ch)//mutator
	{
		return 1;
	}	
	public int[] getsCh()//accessor
	{
		return sCh;
	}	
}
public class AirlineReservationSystem
{
	public static void main(String args[])
	{
		
		int otp=1;
		Scanner sc=new Scanner(System.in);
		ReservationSystem rs=new ReservationSystem();
		int arr[]=rs.getsCh();
		arr=new int[10];
		int l=arr.length;
		while(otp==1){
		System.out.println("1. Smoker " );
		System.out.println("2. Non-Smoker ");
		System.out.println("Any other key to exit");
		System.out.println("Enter your choice : ");
		char c=(sc.next()).charAt(0);
		
		//System.out.println(l);
		if(c=='1')
		{
			int count=0;
			for(int i=0;i<l/2;i++)
			{
				
				if(arr[i]==0)
				{
					display(i+1,1);
					arr[i]=rs.setSeatVal(arr[i]);
					count++;
					break;
				}	
			}
			if(count==0){
			System.out.println("No seats empty in Smoking section, will it be fine if a seat is assigned in the non-smoking section?");
			System.out.println("Press 1 for YES");
			System.out.println("Press 2 for NO");
			System.out.println("Press any other number to exit.");
			char ch=(sc.next()).charAt(0);
			if(ch!='1')
			{
				System.out.println("The next flight leaves in 30 mins.");
				displayG(arr);
				break;
			}
			else if(ch=='1')
			{
				for(int j=l/2;j<l;j++)
				{
					if(arr[j]==0)
					{
						display(j+1,2);
						arr[j]=rs.setSeatVal(arr[j]);
						break;
					}
					else 
					{
						System.out.println("The next flight leaves in 30 mins.");
						displayG(arr);
						break;
					}
				}
			}
			else
			{
				System.out.println("ERROR!!! Please try again... Press 1 to try again or any key to exit.");
				char x=(sc.next()).charAt(0);
				if(x=='1')
				{
					otp=1;
					break;	
				}
				else
				{
					otp=0;
					break;
				}
			}
			}	
		}
		else if(c=='2')
		{
			int count=0;
			for(int i=l/2;i<l;i++)
			{
				
				if(arr[i]==0)
				{
					display(i+1,2);
					arr[i]=rs.setSeatVal(arr[i]);
					count++;
					break;
				}	
			}
			if(count==0){
				char ch;
			System.out.println("No seats empty in Non-Smoking section, will it be fine if a seat is assigned in the smoking section?");
			System.out.println("Press 1 for YES");
			System.out.println("Press 2 for NO");
			
			System.out.println("Press any other key to exit.");
			
			ch=(sc.next()).charAt(0);
			
			
			if(ch!='1')
			{
				System.out.println("The next flight leaves in 30 mins.");
				displayG(arr);
				break;
			}
			else if(ch=='1')
			{
				for(int j=0;j<l/2;j++)
				{
					if(arr[j]==0)
					{
						display(j+1,1);
						arr[j]=rs.setSeatVal(arr[j]);
						break;
					}
					else 
					{
						System.out.println("The next flight leaves in 30 mins.");
						displayG(arr);
						break;
					}
				}
			}
			else
			{
				System.out.println("ERROR!!! Please try again... Press 1 to try again or any other number to exit.");
				char x=(sc.next()).charAt(0);
				if(x=='1')
				{
					otp=1;
					break;	
				}
				else
				{
					otp=0;
					break;
				}
			}
			}
		}
		else
		{
			System.out.println("Exitting... Thank you!!!");
			displayG(arr);
			break;
		}
	}}
	public static void display(int a, int b)
	{
		if(b==1)
		{
			System.out.println("      BOARDING PASS");
			System.out.println("************************");
			System.out.println("Seat number : "+a);
			System.out.println("Section     : SMOKING");
			System.out.println("************************");
		}
		else if(b==2)
		{
			System.out.println("       BOARDING PASS");
			System.out.println("***************************");
			System.out.println("Seat number : "+a);
			System.out.println("Section     : NON-SMOKING");
			System.out.println("***************************");
		}
	}
	
	public static void displayG(int arr1[])
	{
		System.out.println("The current flight bookings are as follows:");
		for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
		System.out.println("                   *");
		for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
		System.out.println("                  * *");
		for(int i=0;i<5;i++)
		{
			if(i==1||i==3)
			{
				if(arr1[i]==0)
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("    **************   **************");
				}
				
				else
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("    ************** S **************");
				}
			}
			else if(i==2)
			{
				if(arr1[i]==0)
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("  *              *   *             *");
				}
				
				else
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("  *              * S *             *");
				}
			}
			else
			{
				if(arr1[i]==0)
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("                 *   *");
				}
				else
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("                 * S *");
				}
			}
		}
		for(int i=5;i<10;i++)
		{
			if(i==9)
			{
				if(arr1[i]==0)
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("              ****   ****");
				}
				else
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("              ****N-S****");
				}
			}
			else
			{
				if(arr1[i]==0)
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("                 *   *");
				}
				else
				{
					for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
					System.out.println("                 *N-S*");
				}
				
			}
		}
		for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
		System.out.println("              ****   ****");
		for(double o=0;o<10000;o++){for(double p=0;p<10000;p++);}
		System.out.println("                  ***");
		 
	}
 }