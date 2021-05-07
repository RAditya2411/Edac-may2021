import java.util.*;
class D2H20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int remainder;
		String str="";
		char hex[] ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.println("Enter the Decimal No.:");
		int num = sc.nextInt();
		while(num !=0)
		{
			remainder = num%16;
			str=hex[remainder]+str;
			num=num/16;
		}
			System.out.println("Number in hexadecimal is:"+str);
	}
}
		