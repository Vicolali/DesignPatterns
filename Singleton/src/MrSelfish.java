
public class MrSelfish {
	
	   private String myMessage = "I am a singleton";
	   private static MrSelfish myInstance;
	   //1. create an object of SingleObject

	   //2. make the constructor private so that this class cannot be instantiated
	   private MrSelfish(){}

	   //3. Create a public static method to act as the constructor. 
	   // This will get the only object available, 
	   // with the return type as the Class itself (i.e. MrSelfish)
	   public static MrSelfish get(){
		   
		
		   if (myInstance == null)
		   {
			   
			   myInstance = new MrSelfish();
		   }
	      return myInstance;
	   }

	   public void showMessage(){
	      System.out.println(myMessage);
	   }
	   
	   //Example of a risky implementation
	   public void setMessage(String newMessage){
		      this.myMessage = newMessage;
		   }

}
/**
PROS:
---------------
- You can be sure that a class has only a single instance.
- You gain a global access point to that instance.
- The singleton object is initialized only when it’s requested for the first time.

CONS:
------------------
 - Violates the Single Responsibility Principle. The pattern solves two problems at the time.
 - The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
 - The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
 - It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. 
 Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.

Relations with Other Patterns
-------------------------------
1. A Facade class can often be transformed into a Singleton since a single facade object is sufficient in most cases.
2. Abstract Factories, Builders and Prototypes can all be implemented as Singletons.
REF: https://refactoring.guru/design-patterns/singleton
**/