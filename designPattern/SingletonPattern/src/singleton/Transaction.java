package singleton;

import java.sql.Connection;

public class Transaction {

    private static Transaction transaction;//=new Transaction();
    private static Connection connection;

    private Transaction(){
        if(transaction != null){
            throw new RuntimeException("please use getEmployee method");
        }
    }

    public static Transaction getTransaction() {
        if (transaction == null){
            synchronized (Transaction.class) {
                if(transaction == null) {
                    transaction = new Transaction();
                }
            }
        }
        return transaction;
    }

    public Connection getConnection(){
        if(connection==null){
            synchronized (Connection.class) {
                if(connection==null) {
                    //connection = new Connection();
                }
            }
        }
        return connection;
    }

}
