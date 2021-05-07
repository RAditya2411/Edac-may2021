import java.util.Scanner;
class Swap15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first variable:");
		int a = sc.nextInt();
		System.out.println("Enter the second variable:");
		int b = sc.nextInt();
		System.out.println("No.before swapping:"+a+"&"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("No.after swapping:"+a+"&"+b);
	}
}
	     