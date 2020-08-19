import java.util.Scanner;
public class SortStringArray 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		String str,temp="";
		System.out.println("Enter the number of strings you want to 
                                                                                                        compare");
		n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the strings");
		for(i=0;i<n;i++)
		{
			str=sc.next();
			arr[i]=str;
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if((arr[i].compareTo(arr[j]))>0)
				{	
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nSorted Array");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
