// Facade Code Example 

class RobotBody {
    public static void createRobot () {
        System.out.println("Preparing for your robot creation ...");
    }

    public static void destroyRobot () {
        System.out.println("Preparing for robot destruction ...");
    }

    public void createParts () {
        System.out.println("Robot parts created.");
    }

    public void destroyParts () {
        System.out.println("Robot parts destroyed.");
    }

}

class RobotHands {
    public void install (String type) {
        System.println(type + " hands installed.");
    }

    public void remove (String type) {
        System.out.println(type + " hands removed.");
    }

}

class RobotColor {
    public void setColor (String color) {
        System.out.println("Robot color set to: " + color);
    }
}

// Facade Class

class RobotFacade {
    private RobotColor color = new RobotColor();
    private RobotHands hands = new RobotHands();
    private RobotBody body = new RobotBody();

    public void createRobot (String type, String handtype, String colortype) {
        RobotBody.createRobot();
        System.ot.println("Creating " + type + " Robot...");
        color.setColor(colortype);
        hands.install(handtype);
        body.createParts();
        System.out.println(type + " Robot creation completed.");
    }

    public void destroyRobot (String type, String handtype) {
        RobotBody.destroyRobot();
        System.out.println("Destroying " + type + " Robot.");
        hands.remove(handtype);
        body.destroyParts();
        System.out.println(type + " Robot destruction complete...")
    }

}

// Client Code

public class FacadePatternExample {
    
    public static void main (String args[]) {
        RobotFacade facade = new RobotFacade();
        
        // Create Robots
        facade.createRobot("Milan", "Milan", "Steel");
        facade.createRobot("Robonaut", "Robonaut" "Green");

        // Destroy Robots
        facade.destroyRobot("Milan", "Milan");
        facade.destroyRobot("Robonaut", "Robonaut");
    }
}