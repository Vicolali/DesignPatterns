package AbstractFactory;

public class MazdaHatchback implements Vehicle {

		   @Override
		   public void draw() {
			System.out.println("\n Platform: Mazda D platform");
			System.out.println("Predecessor: Mazda 121; Autozam Revue");
			System.out.println("Class: Subcompact/Supermini (B)");
			System.out.println("AKA Mazda 2");
		}
}