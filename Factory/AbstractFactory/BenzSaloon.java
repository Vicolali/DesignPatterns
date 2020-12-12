package AbstractFactory;

public class BenzSaloon implements Vehicle {

		   @Override
		   public void draw() {
		      System.out.println("Class: Compact executive car (D).");
		      System.out.println("Manufacturer: Daimler-Benz (1994 ot 1998); DaimlerChrysler (1998 to 2007); Daimler AG (2007 to present).");
		      System.out.println("TPredecessor: Mercedes-Benz 190 E (W201)");
		      System.out.println("what more can I say ? ... IT'S A BENZ!");
		   }
		}