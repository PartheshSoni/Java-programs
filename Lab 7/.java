import java.util.*;

class MyDegree{
	double celcius=0, fahrenheit=0;
	MyDegree(double temp, String type){
	if(type=="fahrenheit"){
		fahrenheit=temp;
		celcius=(5/9)*(fahrenheit-32);
	}

	else if(type=="celcius"){
		celcius=temp;
		fahrenheit=(9/5)*celcius+32;
	}


}

class MyDate{
	int date, month, year;
	MyDegree high=new MyDegree();
	MyDegree low=new MyDegree();

	MyDate(int date, int month, int year){
	int valid=isValid(date, month, year);
	if(valid==true){
		this.date=date;
		this.month=month;
		this.year=year;
	}

	else{
		this.date=1;
		this.month=1;
		this.year=2017;
		System.out.println("The entry is invalid. By default the date will be set to: 1/ 1/ 2017)
		}
	}

	boolean isValid(int d,int m,int year){
	if(m<1||m>12)
	return false;

	else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
	if(d>0&&d<32)
		return true;

	else 
		return false;
	}

	else if(m==4||m==6||m==9||m==11){
		if(d>0&&d<31)
			return true;

		else 
			return false;
}

	else if(m==2){
		if(d>0&&d<28)
			return true;

		else 
			return false;
	}
}

class Solution{
    public static void main(String args[]){
        MyDate mydate=new MyDate();
	Scanner scan=new Scanner(System.in);
	int d, m, y;

	d=scan.nextInt();
	m=scan.nextInt();
	y=scan.nextInt();

	mydate.getDate(d, m, y);



	

