import java.util.Scanner;
class ScannerClass
{
	public static void main(String args[])
	{
		int a;
		String s;
		float f;
		
		Scanner in= new Scanner(System.in);

		System.out.println("Enter the string s:");
		s=in.nextLine();
		
		System.out.println("Enter the value of a (int):");
		a=in.nextInt();

		System.out.println("Enter the value of f (float):");
		f=in.nextFloat();

		

		System.out.println("a:"+a);
		System.out.println("f:"+f);
		System.out.println("s:"+s);
	}
}