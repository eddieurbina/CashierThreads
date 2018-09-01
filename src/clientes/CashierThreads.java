
package clientes;

public class CashierThreads extends Thread {
    private String name;
    private Client client;
    private long initialTime; 

    public CashierThreads(String name, Client client, long initialTime) {
        this.name = name;
        this.client = client;
        this.initialTime = initialTime;
    }
    
    @Override
    public void run(){
        System.out.println("La cajera " + this.name + 
                    " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + client.getName() + 
                    " EN EL TIEMPO: " + (System.currentTimeMillis() - initialTime) / 1000 +
                    " seg" );
    
        for (int i = 0; i < client.getShoppingCar().length; i++) {
            this.waitXSeconds(client.getShoppingCar()[i]);
            System.out.println("Procesando el producto " + (i + 1) +
            " -> Tiempo: " + (System.currentTimeMillis() - initialTime) /1000 + 
            " segs.");
        }
        
        System.out.println("La cajera " + this.name + " HA TERMINADO DE PROCESAR " + 
                client.getName() + " EN EL TIEMPO: " + 
                (System.currentTimeMillis() - initialTime) / 1000 + " segs.");
    }
    
    public void waitXSeconds(int seconds){
        try {
            Thread.sleep(seconds *1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("Error experarXsegundos [...]");
        }
    }
}
