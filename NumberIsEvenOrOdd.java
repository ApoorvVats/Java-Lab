import java.util.Scanner;
public class NumberIsEvenOrOdd 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		if(n<0)
		{
			System.out.println("Entered number is negative");
		}
		else if(n%2!=0)
		{
			System.out.println("Entered number is odd");
		}
		else
		{
			System.out.println("Entered number is even");
		}
	}
}
