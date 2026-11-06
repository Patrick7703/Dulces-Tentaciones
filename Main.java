import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ==========================================
        // REQUISITO: 7 TIPOS DE DATOS (Primitivo vs Wrapper)
        // ==========================================
        int cantidadExistencia_primitivo = 50;
        Integer cantidadExistencia_objeto = 50;

        double temperaturaHorno_primitivo = 180.5;
        Double temperaturaHorno_objeto = 180.5;

        boolean tieneDescuento_primitivo = true;
        Boolean tieneDescuento_objeto = true;

        char tamanoLetra_primitivo = 'M';
        Character tamanoLetra_objeto = 'M';

        float pesoPorcion_primitivo = 125.5f;
        Float pesoPorcion_objeto = 125.5f;

        long idTransaccion_primitivo = 9876543210L;
        Long idTransaccion_objeto = 9876543210L;

        byte nivelDulzura_primitivo = 4;
        Byte nivelDulzura_objeto = 4;

        // ==========================================
        // REQUISITO: COLECCIONES
        // ==========================================
        ArrayList<String> postresTop = new ArrayList<>();
        postresTop.add("Pastel de Tres Leches");
        postresTop.add("Galleta Chispas");

        LinkedList<String> filaPedidos = new LinkedList<>();
        filaPedidos.add("Pedido #001 - Juan");
        filaPedidos.add("Pedido #002 - María");

        HashSet<String> ingredientesUnicos = new HashSet<>();
        ingredientesUnicos.add("Harina");
        ingredientesUnicos.add("Azúcar");
        ingredientesUnicos.add("Harina"); // Duplicado ignorado

        HashMap<String, String> inventarioCodigos = new HashMap<>(); // Corregido paréntesis faltante
        inventarioCodigos.put("P01", "Pastel de Chocolate");
        inventarioCodigos.put("G02", "Galleta de Avena");

        // ==========================================
        // REQUISITO: POLIMORFISMO Y HERENCIA
        // ==========================================
        Postre[] vitrinaDePostres = new Postre[3];
        vitrinaDePostres[0] = new Pastel("Pastel de Bodas", 1500.0, false, 3);
        vitrinaDePostres[1] = new Galleta("Galleta de Macadamia", 25.5, false, "Mantequilla");
        vitrinaDePostres[2] = new Gelatina("Gelatina Mosaico", 45.0, true, "Fresa y Rompope");

        System.out.println("--- MENÚ DE LA REPOSTERÍA (Ejecución del ciclo For) ---");
        for (Postre postreTemporal : vitrinaDePostres) {
            postreTemporal.describirPostre();
        }
    }
}