import java.util.*;

class error
{
	public static void main(String args[])
	{
		int i;
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		try{
			for(i=0;i<=5;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("Index you are trying to use is more than allocated");}
		
	}
}
