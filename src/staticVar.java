
public class staticVar {
	
	String name;  // Instance Variable as it is tied up to the object
	String address;  // Instance Variable as it is tied up to the object
	static String city="Bangalore";  
	// usage of static keyword will make the value constant at all instances and accessible to all objects.
	// now it will be called as static variable instead of instance variable.
	// static variables belong to class and called as class variables
	
	static int i = 0;
	
	/*instead of initializing static variables individually, it can be done in a static block
	 * Static {
	 * city = "Bangalore";
	 * i=0;
	 * }
	 */
	
	staticVar(String name, String address) //Local variables: Variables which belong to constructors
	{
		this.name=name;
		this.address=address;	
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	public static void getCity()  // Static Method: Also called as class method, not dependent on any objects
	{
		System.out.println(city);  // Static method will only accept static variables
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticVar obj = new staticVar("Prabin","Yelahanka");
		staticVar obj1 = new staticVar("Hari","Kormangala");
		staticVar obj2 = new staticVar("Shyam","Hebbal");
		obj.getAddress();
		obj1.getAddress();
		staticVar.getCity(); //as it's a class method so to call a static method class name needs to be used.
		staticVar.i = 4; // Value can be assigned to static variables during runtime using class name.
		obj.address = "XYZ"; // Value can be assigned to instance variables during runtime using object name.
	}

}
