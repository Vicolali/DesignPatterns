package AbstractFactory;

public class BenzHatchback implements Vehicle {

		   @Override
		   public void draw() {
			   System.out.println("Manufacturer	\r\n" + 
			   		"Daimler-Benz (1997–1998)\r\n" + 
			   		"DaimlerChrysler (1998–2007)\r\n" + 
			   		"Daimler AG (2007–present)");
			   System.out.println("1997–present");
		}
}