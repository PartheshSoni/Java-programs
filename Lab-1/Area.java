import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int radius;
		float area, perimeter, PI=3.14f;
		System.out.println("Enter the value of radius: ");
		radius=scan.nextInt();
		area=PI*radius*radius;
		perimeter=2*PI*radius;
		System.out.println("The area of the circle is "+area+" and the perimeter is "+perimeter);
	}
}
		 