import java.util.*;
class stingy{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s="Nirma University";
		String rev="";String edit="";
		int len=s.length();
		System.out.println();
		System.out.println("Without using inbuilt functions...");
		System.out.println();
			
		for(int i=0; i<len; i++){
			rev+=s.charAt(len-i-1);
		}
		System.out.println(rev);
		
		for(int i=0; i<len; i++){
			if(s.charAt(i)=='N'&&s.charAt(i+1)=='i')
				edit+='A';
			else if(s.charAt(i)=='i'&&s.charAt(i-1)=='N')
				edit+='b';
			
			else
				edit+=s.charAt(i);
		}
			
		System.out.println(edit);
		
		String replace="";
		int count=0;
		for(int i=0; i<len; i++){
		 if(s.charAt(i)=='r'&&s.charAt(i+1)=='m'&&s.charAt(i+2)=='a'){
			count++;
			i+=2;
		} 
		if(s.charAt(i)=='U'&&s.charAt(i+1)=='n'&&s.charAt(i+2)=='i'){
			count++;
			i+=2;
			}
		}
			
		if(count>1)
			System.out.println("Both substrings are present" );
			
		System.out.println();
		System.out.println();
		System.out.println("Using inbuilt methods of string...");
		System.out.println();
			
		String s2=s.replace("Ni", "Ab");
		System.out.println(s2);
		if(s.indexOf("rma")!=-1){
			if(s.indexOf("Uni")!=-1){
			System.out.println("Both substrings are present.");		
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Using StringBuffer...");
		System.out.println();
			
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		System.out.println(s1);
		
		s1.reverse();
		s1.replace(0,  1, "Ab");
		
		System.out.println(s1);
		if(s1.indexOf("rma")!=-1){
			if(s1.indexOf("Uni")!=-1){
				System.out.println("Both substrings are present.");		
			}
		}
		else 
		System.out.println("Both substrings are absent.");
	}
}
			
			