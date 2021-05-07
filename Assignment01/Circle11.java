import java.util.*;
class Circle11
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radious:");
		double r = sc.nextDouble();
		double pi = 3.14;
		double area = pi * r * r;
		double perimeter = 2 * pi *r;
		System.out.println("Area of Circle is:" + area);
		System.out.println("Perimeter of Circle is:" + perimeter);
	}
}
		
		
		
		