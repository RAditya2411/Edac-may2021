import java.util.Scanner;
class Rectangle13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of Rectangle:");
		float w = sc.nextFloat();
		System.out.println("Enter the height of Rectangle:");
		float h = sc.nextFloat();
		float a = h*w;
		float p = 2*(h+w);
		System.out.println("Area is:"+w+"*"+h+"="+a);
		System.out.println("Perimeter is:"+"2"+"*"+"("+w+"+"+h+")"+"="+p);
		
	}
}

		
		
