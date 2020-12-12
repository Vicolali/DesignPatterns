package AbstractFactory;

/**
- This is the Sub Factory, A subclass of Vehicle Factory
- A.K.A. The so called special objects
**/

public class BenzFactory extends VehicleFactory {

//use getVehicle method to get object of type Vehicle 
	
	   public Vehicle getVehicle(String VehicleType){
		   
	      if(VehicleType == null){
	         return null;
	      }		
	      if(VehicleType.equalsIgnoreCase("SUV")){
	         return new BenzSuv();
	         
	      } else if(VehicleType.equalsIgnoreCase("HATCHBACK")){
	         return new BenzHatchback();
	         
	      } else if(VehicleType.equalsIgnoreCase("SALOON")){
	         return new BenzSaloon();
	      }
	      
	      return null;
	   }
	}