public class Tienda {
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private  int stock;

    public Tienda() {
    }

    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String existeStock(){
        return "La cantidad de stock es: "+ getStock();
    }
}
