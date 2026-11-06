public class Galleta extends Postre {
    private String tipoMasa;

    public Galleta(String nombre, double precio, boolean esVegano, String tipoMasa) {
        super(nombre, precio, esVegano);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void describirPostre() {
        System.out.println("[Galleta] " + nombre + " hecha con masa de " + tipoMasa + ". Precio: $" + precio);
    }
}