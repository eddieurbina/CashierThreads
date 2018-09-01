
package clientes;

public class MainThread2 implements Runnable {
    private Client client;
    private Cashier cashier;
    private long initialTime;

    public MainThread2(Client client, Cashier cashier, long initialTime) {
        this.client = client;
        this.cashier = cashier;
        this.initialTime = initialTime;
    }
    public static void main(String[] args) {
        Client client1 = new Client("Client 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Client client2 = new Client("Client 2", new int[] { 1, 3, 5, 1, 1 });
        
        Cashier cashier1 = new Cashier("Cashier 1");
        Cashier cashier2 = new Cashier("Cashier 2");
        
        long initialTime = System.currentTimeMillis(); 
        Runnable process1 = new MainThread2(client1, cashier1, initialTime);
        Runnable process2 = new MainThread2(client2, cashier2, initialTime);
        
        new Thread(process1).start();
        new Thread(process2).start(); 
    }
    
    @Override
    public void run() {
        this.cashier.processPurchase(this.client, this.initialTime);
    }
}
