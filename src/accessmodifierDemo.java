
public class accessmodifierDemo {
	
	//detailed table on access modifiers

	//http://javabeginnerstutorial.com/core-java-tutorial/access-modifier-in-java/
	
	void abc()
	{
		System.out.println("hello");
	}
    
	// Default : Access methods/variables anywhere only in the package, even if u have imported the class.
	// Public : Access methods/variables anywhere accross all the package
	// Private : Methods/Variables cannot be accessed outside the class of same package as well.
	// Protected : Methods/Variables can be accessed in sub classes only(in other packages also).
	// Protected = Default + Another Subclass in Other Package
}
