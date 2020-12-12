package SimpleFactory;

/**
- This is the Factory
- A.K.A. The so called special objects
**/

public class VehicleFactory {

//use getVehicle method to get object of type Vehicle 
	
	   public Vehicle getVehicle(String VehicleType){
		   
	      if(VehicleType == null){
	         return null;
	      }		
	      if(VehicleType.equalsIgnoreCase("SUV")){
	         return new Suv();
	         
	      } else if(VehicleType.equalsIgnoreCase("HATCHBACK")){
	         return new Hatchback();
	         
	      } else if(VehicleType.equalsIgnoreCase("SALOON")){
	         return new Saloon();
	      }
	      
	      return null;
	   }
	}