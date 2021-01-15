package singleton;

public class Application {

    public static void main(String[] args){

        Transaction transaction = Transaction.getTransaction();
        System.out.println(transaction);

        Transaction transaction1 = Transaction.getTransaction();
        System.out.println(transaction1);
    }
}
