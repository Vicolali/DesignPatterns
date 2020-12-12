import AbstractFactory.*;

/**
 * -- FACTORY PATTERN - A creational pattern
- One of the most used design patterns
- Factory uses a special object to create other objects.
- Create object without exposing the creation logic to the client
- Reduces coupling of code
**/
public class Main {

 /**  public static void main(String[] args) {
	   
	  // Get the Factory
      VehicleFactory VehicleFactory = new VehicleFactory();
      
      // Get an object SALOON Type 
      Vehicle Vehicle1 = VehicleFactory.getVehicle("SALOON");
      Vehicle1.draw();
      

      //get an object of SUV Type .
      Vehicle Vehicle2 = VehicleFactory.getVehicle("SUV");
      Vehicle2.draw();

      //get an object of HATCHBACK Type .
      Vehicle Vehicle3 = VehicleFactory.getVehicle("HATCHBACK");
      Vehicle3.draw();
   } **/
   
  
    
    public static void main(String[] args) {

      // Get your different factories
      VehicleFactory VehicleFactory1 = FactoryProducer.getFactory("MAZDA");
      VehicleFactory VehicleFactory2 = FactoryProducer.getFactory("BENZ");
      
      // Get objects of "Mazda" Model, "SALOON" Type
      Vehicle Vehicle1 = VehicleFactory1.getVehicle("SALOON");
      Vehicle1.draw();

      // Get objects of "Mazda" Model, "SUV" Type
      Vehicle Vehicle2 = VehicleFactory1.getVehicle("SUV");
      Vehicle2.draw();

      // Get objects of "Mazda" Model, "HATCHBACK" Type
      Vehicle Vehicle3 = VehicleFactory1.getVehicle("HATCHBACK");
      Vehicle3.draw();
      
		 try {
	            Thread.sleep(6000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
      // Get objects of "Benz" Model, "SALOON" Type
      Vehicle Vehicle4 = VehicleFactory2.getVehicle("SALOON");
      Vehicle4.draw();

      // Get objects of "Benz" Model, "SUV" Type
      Vehicle Vehicle5 = VehicleFactory2.getVehicle("SUV");
      Vehicle5.draw();

      // Get objects of "Benz" Model, "HATCHBACK" Type
      Vehicle Vehicle6 = VehicleFactory2.getVehicle("HATCHBACK");
      Vehicle6.draw();
 	 try {
         Thread.sleep(6000);
     } catch (InterruptedException ex) {
         ex.printStackTrace();
     }
 	   Vehicle Vehicle41 = VehicleFactory1.getVehicle("TRUCK");
       Vehicle41.draw();
   }
   
}