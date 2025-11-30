/*
2. Implement the Factory Method Pattern to create cross-platform UI elements with-
out coupling the client code to concrete UI classes as shown.
*/

/*
Implements -> Class from Interface (Interface To Class)
Extends -> Child Class From Parent Class (Class To Class)
*/

interface Button {
    void render();
    void onClick();
}

class WindowsButton implements Button {
    public void render () {
        System.out.println("Window button rendered");
    }

    public void onClick () {
        System.out.println("Windows button clicked");
    }
}

class HTMLButton implements Button {
    public void render () {
        System.out.println("HTML Butoon rendered");
    }

    public void onClick () {
        System.out.println("HTML Button clicked");
    }
}

abstract class Dialog {
    // Factory Method
    public abstract Button createButton ();

    public void render () {
        System.out.println("Rendering dialog...");
        Button button = createButton();
        button.render();
        button.onClick();
        System.out.println("Dialog rendering completed");
    }
}

class WindowsDialog extends Dialog {
    public Button createButton () {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {
    public Button createButton () {
        return new HTMLButton();
    }
}

// Client Code
public class FactoryExampleDemo {
    public static void main (String args[]) {
        
        // Create Windows UI
        Dialog windowsDialog = new WindowsDialog();
        windowsDialog.render();

        // Create Web UI
        Dialog webDialog = new WebDialog();
        webDialog.render();
 
    }
}

