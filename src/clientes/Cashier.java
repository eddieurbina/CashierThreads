
package clientes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }
    
    public void processPurchase(Client client, long timeStamp) {
        System.out.println("La cajera " + this.name + 
                    " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + client.getName() + 
                    " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 +
                    " seg" );
    
        for (int i = 0; i < client.getShoppingCar().length; i++) {
            this.waitXSeconds(client.getShoppingCar()[i]);
            System.out.println("Procesando el producto " + (i + 1) +
            " -> Tiempo: " + (System.currentTimeMillis() - timeStamp) /1000 + 
            " segs.");
        }
        
        System.out.println("La cajera " + this.name + " HA TERMINADO DE PROCESAR " + 
                client.getName() + " EN EL TIEMPO: " + 
                (System.currentTimeMillis() - timeStamp) / 1000 + " segs.");
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
