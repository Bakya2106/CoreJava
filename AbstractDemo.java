//object cannot be created for abstract classes directly 
//abstract classes can be declared and may be extended by other classes in future

abstract class human{
	
	public abstract void man();
	public void woman() {
		System.out.println("Women");
	}
}

class men extends human{

	@Override
	public void man() //undefined parent abstract class's abstract method has to be defined in child class
	{
		// TODO Auto-generated method stub
		System.out.println("Man");
	}
	
}

class printnums{
	public printnums(Number i) //Number is an abstract class which is a parent class for Integer, float, double, 
	                           //so class Number can be used for all types 
	
	{
		System.out.println("Number is "+i);
	}
	
	public void printnums2(Integer i) {
		System.out.println("Integer is " + i);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
	 	men m=new men();
	 	m.woman();
	 	m.man();
	 	
	 	human h=new men(); //referring to abstract class human
	 	
	 	h.woman();
	 	
	 	//example
	 	printnums p=new printnums(5.5);
	 	
	 	p.printnums2(5); // if we pass float value it will generate compile error
	 	
	}
}
