// Singleton Example - Captain Class

// final keyword -> prevents extension of this class
final class Captain{

    // Static -> belongs to the class not to objects 
    // type -> Captain
    private static Captain captain; 

    private Captain() { } // Private Constructer (Prevents the use of new keyword in main)

    // synchronized -> handles one thread at a time 
    // static -> can be called without object creation 
    public static synchronized Captain getcaptain() {
        if (captain == null) { // If Captain class object not created in main
            
            captain = new Captain ();
            system.out.print("Captain object created");

        }
        else { // If a captain object has been created once 
            system.out.print("Captain object already exist");
        }

        return captain;
    }
}

class ExtendCaptain extends Captain {} // Not possible -> error will be thrown as Captain class uses final keyword which blocks extension

public class SingletonDemo {}{

    public static void main (String args[]){

        Captain captain1 = new Captain; // Constructor is private. new keyword cannot be used

        Captain captain1 = Captain.getcaptain(); 
        system.out.print("Created captain object successfully");

        Captain captain2 = Captain.getcaptain(); // Trying to create new captain

        if (captain1 == captain2) {

            system.out.print("captain1 and captain2 are same instances"); // This will execute successfully as both will points to same instance (Singleton approach)
        
        }
        
    }
}