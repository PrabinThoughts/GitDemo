

public class AustralianTrafficInterfaceDemo implements CentralTraffic,ContinentalTraffic {
	
	// Interface is used in a class using implements keyword and a class can implement more than one interface at a time.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a= new AustralianTrafficInterfaceDemo();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		AustralianTrafficInterfaceDemo at=new AustralianTrafficInterfaceDemo();
		ContinentalTraffic ct=new AustralianTrafficInterfaceDemo();
		at.walkonsymbol();
		ct.Trainsymbol();
		
		// a. walkonsymbol() or a.trainsymbol() is not possible.
		// The reason behind the same is as object a is created for central traffic interface only.
		// So to achieve the same we need to create two different objects.
		// one specific to continental interface, other specific to current class.
	}
	
	public void walkonsymbol()
	{
	System.out.println("walking");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
		//code being written inside the method only in the class where the interference is used.
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
		//code being written inside the method only in the class where the interference is used.
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
		//code being written inside the method only in the class where the interference is used.
		
	}
	
}
			
			