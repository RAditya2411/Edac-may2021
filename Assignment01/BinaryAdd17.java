import java.util.*;
class BinaryAdd17
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		num1= Integer.parseInt(s1,2);
		String s2 = sc.nextLine();
		num2= Integer.parseInt(s2,2);
		System.out.println(Integer.toBinaryString(num1+num2));
	}
}