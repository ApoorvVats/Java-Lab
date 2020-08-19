import java.util.Scanner;

public class ExperimentOne
{
	public static void main(String args[]) 
	{
  	 	String arr10[][]=first_input();
  	 	String arr11[][]=second_input();
  	 	int id[]=user_input(arr10,7);
  	 	int match=id[1];
  	 	if(match!=0)
  	 	{	String arr12[]=employee_data(match,arr10);
	  	 	String code=arr12[2];
	  	 	int basic=Integer.parseInt(arr12[4]);
	  	 	int hra=Integer.parseInt(arr12[5]);
	  	 	int it=Integer.parseInt(arr12[6]);
	  	 	String arr13[]=allowance(arr11,code);
	  	 	int da=Integer.parseInt(arr13[1]);
	  	 	int salary=basic+hra+da-it;
	  	 	System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Emp No", 
           				    "Emp Name", "Department", "Designation", "Salary");
		    System.out.printf("%-15s%-15s%-15s%-15s%- 
                                                                 15s",arr12[0],arr12[1],arr12[3],arr13[0],salary);
  	 	}
  	 	else
  	 	{
  	 		System.out.println("There is no employee with empid : "+id[0]);
  	 	}
   }
   
   
   public static String[][] first_input()
   {
	   String arr[][]={{"1001","Ashish","01/04/2009","e","R&D","20000", "8000",  
                                       "3000"},{"1002", "Sushma", "23/08/2012", "c", "PM", "30000",  
                                       "12000","9000"},{"1003","Rahul","12/11/2008","k","Acct","10000",   
                                       "8000","1000"},{"1004","Chahat","29/01/2013","r","FrontDesk", 
                                       "12000","6000","2000"},{"1005","Ranjan","16/07/2005","m", 
                                       "Engg","50000","20000","20000"},{"1006", "Suman","1/1/2000", 
                                       "e","Manufacturing","23000","9000","4400"},{"1007",    
		               "Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
	   return arr;
   }
   
   public static String[][] second_input()
   {
	   String[][] arr1 ={{"e","Engineer","20000"},{"c","Consultant","32000"},{"k",  
                                             "Clerk","12000"},{"r","Receptionist","15000"},{"m","Manager", 
	                                 "40000"}};
	   return arr1;
   }
   
   public static int[] user_input(String arr[][],int r)
   {
	   Scanner sc=new Scanner(System.in);
	   int arr2[]=new int[2];
	   int i,row=0;
	   String a;
	   System.out.println("Enter the employee number");
	   a=sc.nextLine();
	   for(i=0;i<r;i++)
	   {
		   if(a.equals(arr[i][0]))
		   {
			   row=i;
		   }
	   }
	   int a1=Integer.parseInt(a);
	   arr2[0]=a1;
	   arr2[1]=row;
	   return arr2;
   }
   
   public static String[] employee_data(int row,String arr[][])
   {
	   String arr3[]=new String[7];
	   arr3[0]=arr[row][0];
	   arr3[1]=arr[row][1];
	   arr3[2]=arr[row][3];
	   arr3[3]=arr[row][4];
	   arr3[4]=arr[row][5];
	   arr3[5]=arr[row][6];
	   arr3[6]=arr[row][7];
	   return arr3;
   }
	
   public static String[] allowance(String arr[][],String code)
   {
	String arr4[]=new String[2];
	switch(code)
	{
	   case "e":
		   arr4[0]=arr[0][1];
		   arr4[1]=arr[0][2];
	   break;
	   case "c":
		   arr4[0]=arr[1][1];
		   arr4[1]=arr[1][2];
	   break;
	   case "k":
		   arr4[0]=arr[2][1];
		   arr4[1]=arr[2][2];
	   break;
	   case "r":
		   arr4[0]=arr[3][1];
		   arr4[1]=arr[3][2];
	   break;
	   case "m":
		   arr4[0]=arr[4][1];
		   arr4[1]=arr[4][2];
  	   break;
	}
	return arr4;
   }
}
