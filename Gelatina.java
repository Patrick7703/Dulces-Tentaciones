public class Gelatina extends Postre {
    private String sabor;

    public Gelatina(String nombre, double precio, boolean esVegano, String sabor) {
        super(nombre, precio, esVegano);
        this.sabor = sabor; // Corregido el operador de asignación del PDF
    }

    @Override
    public void describirPostre() {
        System.out.println("[Gelatina] " + nombre + " con un refrescante sabor a " + sabor + ". Precio: $" + precio);
    }
}