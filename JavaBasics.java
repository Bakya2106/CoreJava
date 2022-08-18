
public class JavaBasics {

	public static void main(String args[]) {
		//System.out.print("Hello World");
		
			//System.out.println("Your first argument is: "+args[0]);  //will lead to error
		
			  
		//primitive data types
		int num=5 ;
		num=10;
		long l=500000000l;
		float f= 8.55f;
		char c=66;
		System.out.println(c);
		double d=9;
		System.out.println(d); //implicit conversion
		int num2=(int) (5.6); //typecasting
		System.out.println(num2);
		System.out.print(num);
		
		int n=3;
		int postincrement=n++;//firstassigned and incremented
		int preincrement=++n;//first incremented and assigned
		n+=5;
		
		
	}
}
