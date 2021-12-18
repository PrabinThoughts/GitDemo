
public class InheritanceChildClassDemo extends InheritanceParentClassDemo {

	// Parent class is inherited in child class using extends keyword.
	// Java doesn't allow multiple inheritance. But C++ does.
	
	public void Engine()
	{
		System.out.println("Engine code implemented");
	}
	
	public void colour()
	{
		System.out.println(colour); // Inherited from parent class as that's defined there.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceChildClassDemo cd= new InheritanceChildClassDemo();
		cd.colour();

	}

}
