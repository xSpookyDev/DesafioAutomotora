public class Cliente extends Persona{
    private int edad;

    public Cliente(int edad) {
        this.edad = edad;
    }

    public Cliente(String rut, String nombre, int edad, int edad1) {
        super(rut, nombre, edad);
        this.edad = edad1;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
