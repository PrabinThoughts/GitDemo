
public class constructorDemo {
	
	// Default Constructor
	public constructorDemo() // must be same name as class name.
	{ System.out.println(" I am in the constructor"); 
	System.out.println(" I am in the constructor lecture 1"); 
	}
	
	public void getData()  // This is a method
	{
		System.out.println("I am inside method");
	}
	
	//Parameterized Constructor
	
	public constructorDemo(int a, int b) 
	{ System.out.println(" I am in the parameterized constructor"); 
	 	int c=a+b; 
	 	System.out.println(c); 
	}
	
	public constructorDemo(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDemo cd= new constructorDemo();
		constructorDemo cds= new constructorDemo("hello");
		constructorDemo c= new constructorDemo(4,5); 
		
		//when ever you create an object constructor is called
		//block of code when ever an object is created
		// compiler will call implicit constructor if you have not defined constructor block.
		// but if any explicit constructor is defined then compiler will call that constructor.
		
	}

}


/*Constructors in Java
A constructor is a special method that is used to initialize an object.Every class has a constructor,if we don't explicitly declare a constructor for any java class the compiler builds a default constructor for that class. A constructor does not have any return type.

A constructor has same name as the class in which it resides. Constructor in Java can not be abstract, static, final or synchronized. These modifiers are not allowed for constructor.

class Car
{
 String name ;
 String model;
 Car( )    //Constructor 
 {
  name ="";
  model="";
 }
}	*/