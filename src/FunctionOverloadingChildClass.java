
public class FunctionOverloadingChildClass extends InheritanceParentClassDemo {
	
	//function overloading
	//either argument count should be different or
	//argument data type should be different
	
	public void getData(int a)
	{
	System.out.println(a);
	}
	public void getData(String a) // Same method name different data type but same args count
	{
	System.out.println(a);
	}
	public void getData(int a,int b) // Same method name same data type but different args count
	{
	System.out.println(b);
	}
	
	public void Gear()
	{
		System.out.println("Current Class code implemented");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	FunctionOverloadingChildClass fn = new FunctionOverloadingChildClass();
		fn.getData("Prabin");
		fn.getData(3);
		fn.getData(3, 4);
		fn.Gear();  // Function overriding: Parent class method is overridden by the code of child class.

	}

}
