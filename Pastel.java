public class Pastel extends Postre {
    private int pisos;

    public Pastel(String nombre, double precio, boolean esVegano, int pisos) {
        super(nombre, precio, esVegano);
        this.pisos = pisos; // Corregido el operador de asignación del PDF
    }

    @Override
    public void describirPostre() {
        System.out.println("[Pastel] " + nombre + " de " + pisos + " pisos. Precio: $" + precio);
    }
}