import java.util.*;
class Complex{
	int a, b;
	Complex(){
	a=0;
	b=0;
	}
	
	Complex(int a, int b){
	this.a=a;
	this.b=b;
	}

	Complex(int a){
	this.a=a;
	this.b=a;
	}

	Complex add(Complex o){
	Complex o1=new Complex();
	o1.a=a+o.a;
	o1.b=b+o.b;
	return o1;
	}
}

class ComplexDemo{
	public static void main(String args[]){
		Complex o2=new Complex();
		Complex o=new Complex();
		Complex o1=new Complex();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter for first complex number...");
		System.out.print("a:");
		o.a=scan.nextInt();
		System.out.print("b:");
		o.b=scan.nextInt();
		System.out.println("Enter for second complex number...");
		System.out.print("a:");
		o2.a=scan.nextInt();
		System.out.print("b:");
		o2.b=scan.nextInt();
		o1=o.add(o2);
		System.out.println("The addition of the two complex numbers "+o.a+" + "+o.b+"i and "+o2.a+" + "+o2.b+"i is "+o1.a+" + "+o1.b+"i");
	}
}
	