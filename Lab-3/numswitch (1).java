import java.util.*;
class numswitch{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=new String();
		str=scan.nextLine();
		int vowels=0, consonents=0, numbers=0;
		int check=0;
		
		for(int i=0; i<str.length(); i++){
			char c=str.charAt(i);
			/*if(c>=48&&c<=57)
			check=1;
		
		else if(c>=65&&c<=90||c>=97&&c<=122){
			 if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			check=2;
		else 
		check=3;}*/
		
		switch(c>=48&&c<=57){
			case true:
			check=1;
			break;
			
			case false:
			switch(c>=65&&c<=90||c>=97&&c<=122){
				case true:
				switch(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
					case true:
					check=2;
					break;
					
					case false:
					check=3;
					break;
				}
				break;
			}
			break;
		}
		
		switch(check){
		case 1:
		numbers++;
		break;
		case 2:
		vowels++;
		break;
		case 3:
		consonents++;
		break;
		}
		check=0;
		}
	System.out.println("The number of vowels, consonents and numbers is "+vowels+", "+consonents+" and "+numbers+" respectively");
	}
}