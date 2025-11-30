// Factory Method - DB Connection Example

// Implements -> Child class from Parent class (Class to Class)
// Extends -> Class from Interface (Interface to Class)

// Interface Class
interface DBConnection {
    void open();
    void close();
}

class SQLServerConnection implements DBConnection {

    public void open() {
        System.out.print("SQLServer connection opened");
    }

    public void close() {   
        System.out.print("SQL Server connection closed");
    }
}

class OracleConnection implements DBConnection {

    public void open() {
        System.out.print("Oracle connection opened");
    }

    public void close() {
        System.out.print("Oracle connection closed");
    }

}

abstract class ConnectionFactory {
    public abstract DBConnection createconnection();
}

class SQLServerFactory extends ConnectionFactory {

    public DBConnection createconnection() {
        return new SQLServerConnection();
    }

}

class OracleFactory extends ConnectionFactory {

    public DBConnection createconnection() {
        return new OracleConnection();
    }

}

public class FactoryExample {

    public static void main (String args[]) {

        ConnectionFactory sqlfactory = new SQLServerFactory ();
        DBConnection sqlconnection = sqlfactory.createconnection ();
        sqlconnection.open ();
        sqlconnection.close ();

        ConnectionFactory oraclefactory = new OracleFactory ();
        DBConnection oracleconnection = oraclefactory.createconnection ();
        oracleconnection.open ();
        oracleconnection.close ();


    }
}