import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {

    //Creo una lista del tipo Conversion
    private List<Conversion> Lista;

    //Con esta función evito que me devuelva una lista null
    private List<Conversion> leerHistorialDesdeArchivo() {
        try (FileReader reader = new FileReader("Historial.json")) {
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Conversion>>() {}.getType();
            List<Conversion> lista = gson.fromJson(reader, listType);
            return lista != null ? lista : new ArrayList<>(); // Evita devolver null
        } catch (IOException e) {
            // Si el archivo no existe o hay error, devolvemos una lista vacía
            return new ArrayList<>();
        }
    }

    public Historial() {
        this.Lista = leerHistorialDesdeArchivo();
    }

    //Declaro las características que deseo almacenar en el historial
    public static class Conversion {
        private final String monedaOrigen;
        private final String monedaDestino;
        private final double cantidad;
        private final double resultado;
        private final String Tiempo;

        public Conversion(String monedaOrigen, String monedaDestino, double cantidad, double resultado) {
            this.monedaOrigen = monedaOrigen;
            this.monedaDestino = monedaDestino;
            this.cantidad = cantidad;
            this.resultado = resultado;
            this.Tiempo = LocalDateTime.now().toString();
        }

        //Le doy un formato a mi Historial.json
        @Override
        public String toString() {
            return "Moneda Original: " + monedaOrigen +
                    ", Moneda Final: " + monedaDestino +
                    ", Cantidad: " + cantidad +
                    ", Resultado: " + resultado +
                    ", Fecha " + Tiempo;
        }
    }

    // Agrego una nueva conversión a la lista
    public void agregarConversion(String monedaOrigen, String monedaDestino, double cantidad, double resultado) throws IOException {
        Lista.add(new Conversion(monedaOrigen, monedaDestino, cantidad, resultado));
        ImprimirHistorial();
    }

    //Imprimo el historial en la terminal
    public void ImprimirHistorial() throws IOException {

        Gson gson = new Gson();

        FileWriter Escritura = new FileWriter("Historial.json");
        Escritura.write(gson.toJson(Lista));
        Escritura.close();
        System.out.println(Lista);
    }

    //Limpio el historial para empezar desde 0 en cada ejecución
    public void LimpiarHistorial(){
        Lista = new ArrayList<>();
    }
}
