public class Postre {
    // ENCAPSULAMIENTO: Uso de diferentes modificadores de acceso
    public String nombre;
    protected double precio;
    private boolean esVegano;

    // Constructor de la clase padre
    public Postre(String nombre, double precio, boolean esVegano) {
        this.nombre = nombre;
        this.precio = precio;
        this.esVegano = esVegano;
    }

    // POLIMORFISMO: Método que será reinterpretado por las clases hijas
    public void describirPostre() {
        System.out.println("Este es un delicioso postre de la tienda llamado: " + nombre);
    }

    // Métodos Getter y Setter para el atributo privado
    public boolean getEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }
}