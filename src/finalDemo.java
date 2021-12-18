
public class finalDemo {
	
	// Class can also be declared as final: final class finalDemo
	// If class is marked as final, we cannot extend that class.
	// Final classes can't be used as parent class to any other class i.e. can't be inherited.
	
	final void getData() 
	{
		System.out.println("This is final method");
	}
	
	// Once a Final method is written, it can't be overridden.
	// Method becomes unique and can't again be used with same name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i=4; 
		// Final keyword is used to declare constant variables. It's value can't be changed.
		

	}

}
