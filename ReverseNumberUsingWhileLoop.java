import java.util.Scanner;
public class ReverseNumberUsingWhileLoop 
{
	public static void main(String args[])
	{
		int n,no=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		while(n!=0)
		{
			rem=n%10;
			no=no*10+rem;
			n=n/10;
			
		}
		System.out.println("Reverse of the number\n"+no);
	}
}