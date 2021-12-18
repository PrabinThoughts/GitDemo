
public class Firstclass {

	// Methods
	public void getData() // Void doesn't return anything
	{
		System.out.println("I m in a method");
	}

	public int fetchData() {
		int a = 10;
		return a;
	}

	public String seeData() {
		String a = "city";
		return a;
	}

	// Any code outside main block can't be executed
	// But a method can't be written inside the main block. So it must be written
	// outside the main block but inside the class.
	// To use a method inside main block, it can be only called by creating the object.
	// Objects are instances/references of a class. For creating an object first a
	// memory allocation needs to be created for the object with help of keyword "new".
	// syntax for creating object: Classname(Basically the return type) objectname = new Classname();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firstclass fn = new Firstclass();
		fn.getData();
		System.out.println(fn.fetchData());
		System.out.println(fn.seeData());

		Secondclass sn = new Secondclass(); // Method can be called from a different java class as well within the same
											// project using the same process
		sn.setData();

		System.out.println("helloworld");
	}

}
