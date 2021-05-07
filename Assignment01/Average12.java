import java.util.Scanner;
class Average12
{
	public static void main(String args[])
	{
		System.out.println("Enter the three numbers:");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float Avg = ((a+b+c)/3);
		System.out.println("Average is:" + Avg);
	}
}