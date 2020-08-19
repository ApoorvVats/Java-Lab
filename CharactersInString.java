import java.util.Scanner;
public class CharactersInString 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str=sc.next();
		
		System.out.println("The characters in the String are");
		for(int i=0;i<str.length();i++) 
		{
			if(i!=str.length()-1)
			{
				System.out.print(str.charAt(i)+",");
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}
