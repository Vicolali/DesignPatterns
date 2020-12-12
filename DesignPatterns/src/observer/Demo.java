package observer;
//MAIN CLASS
import observer.Editor;
import observer.EmailNotificationListener;
import observer.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("D:/2_Work/Code/Personal/DesignPatterns/test.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("volali@co-opbank.co.ke"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        editor.events.unsubscribe("save", new EmailNotificationListener("volali@co-opbank.co.ke"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
