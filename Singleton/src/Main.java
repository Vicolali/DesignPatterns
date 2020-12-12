import java.lang.Runtime;
/**
 * the Singleton is a class that allows only one instance of it to be created.
 * 
 * Why?
 * 1. you want to control access to a shared resource. e.g. a log file
 * 2. you want to provide global access to that instance
 * 
 * How? 
 * See below.
 * **/
public class Main {
	 public static void main(String[] args) {
	      
	/*there is a class called MrSelfish. Try to create an object from it...*/ 	 
		 
		 //MrSelfish object = new MrSelfish();
	      
	//The above is an illegal construct. Why?
	//The constructor MrSelfish() is not visible. Compile Time Error.
		 
	//so, how can you get it ?
	//By retrieving the only object available
		 MrSelfish object = MrSelfish.get();
		 object.showMessage();
		 
		 Changer c = new Changer();
		 c.startChanging();
		 
		
			 try {
		            Thread.sleep(5000);
		        } catch (InterruptedException ex) {
		            ex.printStackTrace();
		        }
		      object.showMessage();

		
	   }
}
