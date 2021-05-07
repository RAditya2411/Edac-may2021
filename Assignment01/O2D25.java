import java.util.*;
class O2D25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long remainder,j=1,sum=0;
		System.out.println("Enter the Octal No.:");
		long octal = sc.nextLong();
		while(octal !=0)
		{
			remainder = octal%10;
			sum = sum +remainder*j;
			j=j*8;
			octal = octal/10;
		}
		System.out.println("Decimal No. is:"+sum);
	}
}