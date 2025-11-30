/* 
6. Implement the Chain of Responsibility Pattern for Authentication requests for an
online ordering system.
*/ 

class AuthRequest {
    private String username;
    private String password;
    private String token;

    public AuthRequest (String username, String password, String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public String getUsername () { return username; }
    public String getPassword () { return password; }
    public String getToken () { return token; }

}

interface AuthHandler {
    void setNextHandler (AuthHandler nextHandler);
    void authenticate (AuthRequest request);
}

class BasicAuthHandler implements AuthHandler {
    private AuthHandler nextHandler;
    
    @Override
    public void setNextHandler (nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void authenticate (AuthRequest request) {
        if(request.getUsername() != null && request.getPassword() != null) {
            if ("admin".equals(request.getUsername()) && "password123".equals(request.getpassword())){
                System.out.println("Basic auth successfull");
            }
            else {
                System.out.println("Basic auth failed - Invlaid Credentials");
            }
        }
        else {
            
            System.out.println("Basic auth skipped - No credentials provided");

            if(nextHandler != null) {
                nextHandler.authenticate(request);
            }

        }
    } 
}

class TokenAuthHandler implements AuthHandler {
    private AuthHandler nextHandler;

    @Override 
    public void setNextHandler (nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void authenticate (AuthRequest request) {
        if(request.getToken() != null) {
            if("validtoken123".equals(reuqest.getToken())) {
                System.out.println("Token auth successfull");
            }
            else {
                System.out.println("Token auth failed");
            }
            else {
                System.out.println("Token auth skipped - No token provided");

                if(nextHandler != null) {
                    nextHandler.authenticate(request);
                }
            }
        }
    }
}

// Client Code
public class AuthSystem {

    private AuthHandler chain;

    public AuthSystem () {
        AuthHandler basicAuth = new BasicAuthHandler();
        AuthHandler tokenAuth = new TokenAuthHandler();

        basicAuth.setNextHandler(tokenAuth);

        this.chain = basicAuth;
    }

    public void processAuth(AuthRequest request) {
        System.out.println("Processing authentication request...");
        chain.authenticate(request);
        System.out.println("Authentication process completed.\n");
    }

}

public class OnlineOrderingSystem {

    public static void main (String args[]) {
        AuthSystem authsystem = new AuthSystem();

        AuthRequest reuqest1 = new AuthRequest("admin", "password123", null);
        authsystem.processAuth(request1);

        AuthRequest request2 = new AuthRequest(null, null, "validtoke123");
        authsystem.processAuth(request2);
    }
    
}