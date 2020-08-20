import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.math.BigInteger;
public class JavaCurrencyConverter 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
	    BigInteger payment=sc.nextBigInteger();
		
	    Locale indiaLocale=new Locale("en", "IN");
	    
	    NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINESE);
		NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println("US: "+ us.format(payment));
		System.out.println("India: "+ india.format(payment));
		System.out.println("China: "+ china.format(payment));
		System.out.println("France: "+ france.format(payment));
		sc.close();
	}
}