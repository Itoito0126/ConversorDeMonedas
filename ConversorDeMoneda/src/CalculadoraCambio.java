public class CalculadoraCambio {

    //Creo una instancia de la clase APIMonedas
    private final APIMonedas apiMonedas;

    public CalculadoraCambio(APIMonedas apiMonedas) {
        this.apiMonedas = apiMonedas;
    }

    //Con este switch-case escojo cuáles de las monedas se extraen según la petición del usuario
    private double ObtenerTasa(String Moneda){
       switch (Moneda.toUpperCase()){
           case "USD":
               return apiMonedas.USD();
           case "ARS":
               return apiMonedas.ARS();
           case "BOB":
               return apiMonedas.BOB();
           case "BRL":
               return apiMonedas.BRL();
           case "CLP":
               return apiMonedas.CLP();
           case "COP":
               return apiMonedas.COP();
           default:
               return 0;
        }
    }

    //Acá se calcula la conversión de la moneda
    public double Convertir(String MonedaOriginal, String MonedaCambiada, double Cantidad){
        double TasaOrigen = ObtenerTasa(MonedaOriginal);
        double TasaCambiada = ObtenerTasa(MonedaCambiada);

        return (Cantidad / TasaOrigen) * TasaCambiada;
    }
}
