import java.util.*;
class B2D22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long remainder,j=1,decimal=0;
		System.out.println("Enter the Binary No.:");
		long binary = sc.nextLong();
		while (binary !=0)//(binary>0)
		{
			remainder = binary%10;
			decimal = decimal + remainder * j;
			j = j*2;
			binary = binary/10;	
		}
		System.out.println("Decimal No. is:" + decimal);
		
		
	}
}
		
