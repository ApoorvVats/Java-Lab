import java.util.Scanner;
public class ReverseNumberUsingRecursion
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int num;
	    System.out.println("Enter a number");
	    num=sc.nextInt();
	    System.out.println("Reverse of the number");
	    reverseMethod(num);
	}
	
	public static void reverseMethod(int n)
	{
	    if(n<10)
	    {
	        System.out.println(n);
	        return;
	    }
	    else
	    {
	        System.out.println(n%10);
	        reverseMethod(n/10);
	    }
	}
}
