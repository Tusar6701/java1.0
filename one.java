//Q1
import java.util.*;
public class one{
	public static void main(String args[])
	{
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the number of students: ");
	  int n=sc.nextInt();
	  String name[]=new String[n];
	  int roll[]=new int[n];
	  double cgpa[]=new double[n];
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("Enter the name of student "+(i+1)+": ");
		  name[i]=sc.next();
		  System.out.println("Enter the roll number of student "+(i+1)+": ");
		  roll[i]=sc.nextInt();
		  System.out.println("Enter the CGPA of student "+(i+1)+": ");
		  cgpa[i]=sc.nextDouble();
	  }
	  double min=cgpa[0];
	  int minPos=0;
	  for(int i=0;i<n;i++)
	  {
		  if(cgpa[i]<min)
		  {
			  min=cgpa[i];
			  minPos=i;
	  }
	  }
		  
	  System.out.println("the name of student having the lowest cgpa is "+name[minPos]+", he got "+min+" CGPA in exams!!");

		  
	}
}
		  