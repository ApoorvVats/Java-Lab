import java.math.BigInteger;
import java.util.Scanner;
public class ReverseBigIntegerNumberUsingRecursion 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		BigInteger n=sc.nextBigInteger();
		System.out.println("Reverse of the number");
		reverseMethod(n);
		sc.close();
	}
	
		
	public static void reverseMethod(BigInteger n)
	{
		if((n.compareTo(BigInteger.TEN))==-1)
		{
			System.out.println(n);
	        return;
		}
	    else
	    {
	        System.out.print(n.mod(BigInteger.TEN));
	        reverseMethod(n.divide(BigInteger.TEN));
	    }
	}
}