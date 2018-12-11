import java.util.*;

class Student{
	String roll=new String();
	String name=new String();
}

class exam extends Student{
	int sub1, sub2, sub3, sub4, sub5, sub6;
}

class result extends Student{
	int totalMarks;
	void printit(){
		totalMarks=sub1+sub2+sub3+sub4+sub5+sub6;
		System.out.println("The total marks of all the subjects is "+totalMarks);
	}
}

class inherDemo{
	public static void main(String args[]){
		Result r=new Result();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the roll number of the student:");
		r.roll=scan.nextLine();
		System.out.println();
		System.out.println("Enter the name of the student:");
		r.name=scan.nextLine();
		System.out.println("Enter the marks of the subjects as follows:");
		System.out.print("MFCS:");
		r.sub1=scan.nextInt();
		System.out.println("OOP:");
		r.sub2=scan.nextInt();
		System.out.println("ENT:");
		r.sub3=scan.nextInt();
		System.out.println("DS:");
		r.sub4=scan.nextInt();
		System.out.println("BE:");
		r.sub5=scan.nextInt();
		System.out.println("AI:");
		r.sub6=scan.nextInt();
		
		r.printit();
	}
}
		