
package clientes;

public class Client {
    private String name;
    int[] shoppingCar;

    public Client(String name, int[] shoppingCar) {
        this.name = name;
        this.shoppingCar = shoppingCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getShoppingCar() {
        return shoppingCar;
    }

    public void setShoppingCar(int[] shoppingCar) {
        this.shoppingCar = shoppingCar;
    }
}
