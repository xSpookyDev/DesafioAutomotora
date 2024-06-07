public class Taxi {
    private int valorPasaje;

    public Taxi() {
    }

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int pasaje){
    int vuelto = 0;
    if (pasaje >= getValorPasaje()){
        vuelto = getValorPasaje() - pasaje;
    }
    return vuelto;
    }
}
