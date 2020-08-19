import java.util.Scanner;
public class ReverseNumberUsingForLoop
{
	public static void main(String[] args) 
	{
	    int n=0,reverse=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    n=sc.nextInt();
		
		for(;n!=0;)
		{
		    reverse=reverse*10;
		    reverse=reverse+n%10;
		    n=n/10;
		}
		System.out.println("\nReverse of number\n"+reverse);
	}
}