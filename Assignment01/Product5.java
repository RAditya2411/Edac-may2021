import java.util.Scanner;
class Product5
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first Number:");
		int a = sc.nextInt ();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt ();
		System.out.println("Product is:");
		int c = a*b;
		System.out.println(a+"*"+b+"="+c);
	}
}