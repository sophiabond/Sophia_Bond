import java.util.Scanner;

public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side length of your cube");
		side = kb.nextDouble();
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with a side length of" + side + "is %.5f", sa);
	}
}