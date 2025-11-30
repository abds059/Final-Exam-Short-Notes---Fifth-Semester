// Chain Of Responsibility Class Example

class Message {
    public String text;
    public Message (String msg) {
        this.text = msg;
    }
}

interface Handler {
    boolean handleMessage (Message message);
    void nextErrorHandler (Handler next);
}

class FaxHandler implements Handler {
    Handler next;

    @Override 
    public void nextErrorHandler (Handler next) {
        this.next = next;
    }

    @Override
    public boolean handleMessage (Message msg) {
        if(msg.text.contains("Fax")) {
            System.out.println("FaxHandler handled: " + msg.text);
        }
        else if (next != null) {
            next.handleMessage(msg)
        }
    }
}

class EmailHandler implements Handler {
    Handler next;

    @Override
    public void nextErrorHandler (Handler next) {
        this.next = next;
    } 

    @Override
    public boolean handleMessage (Message msg) {
        if (msg.text.contains("Email")) {
            System.out.println("Email handler handled: " + msg.text);
        }
        else if (next != null) {
            next.handleMessage(msg);
        }
    }
}

// Client code
public class SimpleChainDemo {
    public static void main (Strings args[]) {

        Handler fax = new FaxHandler();
        Handler email = new EmailHandler();

        fax.nextErrorHandler(email); // Chain : Fax -> Email

        Message m1 = new Message("Fax not working");
        Message m2 = new Message("Email sending failed");

        fax.handle(m1); // Handled by FaxHandler
        fax.handle(m2); // FaxHandler passes to EmailHandler 
    }
}
