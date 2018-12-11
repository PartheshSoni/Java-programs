import java.util.*;
class even{
	public static void main(String args[]){
		int end;
		System.out.println("Enter a number:");
		Scanner scan=new Scanner(System.in);
		end=scan.nextInt();
		System.out.println("The even numbers between 1 and "+end+" are as follows...");
		for(int i=2; i<end; i+=2)
		System.out.println(i);
	}
}