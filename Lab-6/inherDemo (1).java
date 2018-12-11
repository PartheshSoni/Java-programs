import java.util.*;

class Student{
	String roll=new String();
	String name=new String();
}

class exam extends Student{
	int sub1, sub2, sub3, sub4, sub5, sub6;
}

class result extends exam{
	int totalMarks, Percentage, full;
	void doit(){
	totalMarks=super.sub1+super.sub2+super.sub3+super.sub4+super.sub5+super.sub6;
	}
	void printit(){
		
		System.out.println("The total marks of all the subjects of "+super.name+"("+super.roll+") is "+totalMarks+".");
		Percentage=(this.totalMarks/(full*6))*100;
		System.out.println("Hence total Percentage marks is "+Percentage+"%");
	}
}

class inherDemo{
	public static void main(String args[]){
		result r=new result();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the roll number of the student:");
		r.roll=scan.nextLine();
		System.out.println();
		System.out.println("Enter the name of the student:");
		
		r.name=scan.nextLine();
		System.out.println();
		System.out.print("Full Marks of the subjects:");
		r.full=scan.nextInt();
		System.out.println();
		System.out.println("Enter the marks of the subjects as follows:");
		System.out.print("MFCS:");
		r.sub1=scan.nextInt();
		System.out.print("OOP:");
		r.sub2=scan.nextInt();
		System.out.print("ENT:");
		r.sub3=scan.nextInt();
		System.out.print("DS:");
		r.sub4=scan.nextInt();
		System.out.print("BE:");
		r.sub5=scan.nextInt();
		System.out.print("AI:");
		r.sub6=scan.nextInt();
		System.out.println();
		r.doit();
		r.printit();
	}
}