package AbstractFactory;

/**
- This is the Factory,  A subclass of Vehicle Factory
- A.K.A. The so called special objects
**/

public class MazdaFactory extends VehicleFactory {

//use getVehicle method to get object of type Vehicle 
	
	   public Vehicle getVehicle(String VehicleType){
		   
	      if(VehicleType == null){
	         return null;
	      }		
	      if(VehicleType.equalsIgnoreCase("SUV")){
	         return new MazdaSuv();
	         
	      } else if(VehicleType.equalsIgnoreCase("HATCHBACK")){
	         return new MazdaHatchback();
	         
	      } else if(VehicleType.equalsIgnoreCase("SALOON")){
	         return new MazdaSaloon();
	      }
	      else if(VehicleType.equalsIgnoreCase("TRUCK")){
		         return new MazdaTruck();
		      }
	      
	      return null;
	   }
	}