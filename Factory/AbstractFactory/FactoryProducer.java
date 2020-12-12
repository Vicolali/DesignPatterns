package AbstractFactory;

/**
 * 
 * Any new factories are added here.
 * 
 * **/

public class FactoryProducer {
	  
	public static VehicleFactory getFactory(String model){   
	     
		if(model == "BENZ"){
	         return new BenzFactory();         
	      }
		
		else if(model == "MAZDA"){
	         return new MazdaFactory();
	      }
		
		else{
		         return null;
		     }
	   }
	}
