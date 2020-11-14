import java.util.*;
class chk
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		try{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("5th index of array does not exist");
			System.out.println("The message is : "+e.getMessage());
		}
	}
}
