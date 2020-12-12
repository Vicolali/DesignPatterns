package AbstractFactory;


/**
- This is the Factory. an Abstract Factory. A factory of Factories.
- NOTE !!! It is an abstract class.
**/

public abstract class VehicleFactory {

	public abstract  Vehicle getVehicle(String Model);
	//Note, you only pass the model.
	
	}
