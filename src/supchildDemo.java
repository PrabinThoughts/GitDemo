
public class supchildDemo extends supparentDemo{
	
	String name = "JavaLearning";
	
	public void getStringData()
	{
		System.out.println(name); 
		System.out.println(super.name); // Super keyword is used to get the parent class variable.
	}
	
	// Eventhough parent class has the same variable declared,
	//But preference will be given to the local child class variable
	
	public void getData()
	{
		super.getData(); // Super keyword is used to get the parent class method in this case.
		System.out.println("I am child class");
	}
	
	public supchildDemo()
	{
		super();  // Super keyword is used to invoke the parent class constructor in this case.
		//super constructor should always be at the first line in child constructor
		System.out.println("This is child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		supchildDemo cd= new supchildDemo();
		cd.getStringData();
		cd.getData();

	}

}
