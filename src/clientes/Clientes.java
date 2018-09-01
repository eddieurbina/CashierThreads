
package clientes;

public class Clientes {

    public static void main(String[] args) {
        
        
        Client client1 = new Client("Client 1", new int[] {2, 2, 1, 5, 2, 3});
        Client client2 = new Client("Client 2", new int[] {1, 3, 5, 1, 1 });
        
        long initialTime = System.currentTimeMillis();
        CashierThreads cashier1 = new CashierThreads("Cashier One", client1, initialTime);
        CashierThreads cashier2 = new CashierThreads("Cashier Two", client2, initialTime);
        
        
        cashier1.start();
        cashier2.start(); 
        
        
    }
    
}
