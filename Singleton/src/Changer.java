
public class Changer {
	private String myMessage = "Changer has started executing ... ";

	public Changer() {
		super();
	}
	
	public void startChanging(){
	      System.out.println(myMessage);
	      
	  	MrSelfish object = MrSelfish.get();
	  	 object.setMessage("Object has changed");
	 }
	    //show the message
	   
	 
	  
	

	
	
}
