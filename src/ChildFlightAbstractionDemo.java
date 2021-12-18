
public class ChildFlightAbstractionDemo extends ParentFlightAbstractionDemo {
	
	// Abstract class is used in a class using extends keyword.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildFlightAbstractionDemo c = new ChildFlightAbstractionDemo();
		 c.engine();
		 c.safetyinstructions();
		 c.colour();
		
	// ParentFlightAbstractionDemo p = new  ParentFlightAbstractionDemo(); is not possible over here unlike interfaces.		 
	  

	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		
		System.out.println("The colour for the flight is Red");
		
	}

}
