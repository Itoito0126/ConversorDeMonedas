import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        int Op;
        double Cantidad;
        double Resultado;
        boolean Activo = true;

        Scanner Teclado = new Scanner(System.in);

        API Api = new API();
        Historial historial = new Historial();
        APIConversionRates apiConversionRates = Api.ReadAPI();
        APIMonedas apiMonedas = apiConversionRates.ConversionRates();
        CalculadoraCambio calculadora = new CalculadoraCambio(apiMonedas);

        Menu menu = new Menu();
        historial.LimpiarHistorial();

        while (Activo){

            menu.ImprimirMenu();
            Op = Teclado.nextInt();

            switch (Op){
                case 1:
                    System.out.print("Ingrese la cantidad en USD: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("USD", "ARS", Cantidad);
                    System.out.println("Resultado: " + Resultado + " ARS");
                    historial.agregarConversion("USD", "ARS", Cantidad, Resultado);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad en ARS: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("ARS", "USD", Cantidad);
                    System.out.println("Resultado: " + Resultado + " USD");
                    historial.agregarConversion("ARS", "USD", Cantidad, Resultado);
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad en USD: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("USD", "BOB", Cantidad);
                    System.out.println("Resultado: " + Resultado + " BOB");
                    historial.agregarConversion("USD", "BOB", Cantidad, Resultado);
                    break;

                case 4:
                    System.out.print("Ingrese la cantidad en BOB: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("BOB", "USD", Cantidad);
                    System.out.println("Resultado: " + Resultado + " USD");
                    historial.agregarConversion("BOB", "USD", Cantidad, Resultado);
                    break;

                case 5:
                    System.out.print("Ingrese la cantidad en USD: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("USD", "BRL", Cantidad);
                    System.out.println("Resultado: " + Resultado + " BRL");
                    historial.agregarConversion("USD", "BRL", Cantidad, Resultado);
                    break;

                case 6:
                    System.out.print("Ingrese la cantidad en BRL: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("BRL", "USD", Cantidad);
                    System.out.println("Resultado: " + Resultado + " USD");
                    historial.agregarConversion("BRL", "USD", Cantidad, Resultado);
                    break;

                case 7:
                    System.out.print("Ingrese la cantidad en USD: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("USD", "CLP", Cantidad);
                    System.out.println("Resultado: " + Resultado + " CLP");
                    historial.agregarConversion("USD", "CLP", Cantidad, Resultado);
                    break;

                case 8:
                    System.out.print("Ingrese la cantidad en CLP: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("CLP", "USD", Cantidad);
                    System.out.println("Resultado: " + Resultado + " USD");
                    historial.agregarConversion("CLP", "USD", Cantidad, Resultado);
                    break;

                case 9:
                    System.out.print("Ingrese la cantidad en USD: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("USD", "COP", Cantidad);
                    System.out.println("Resultado: " + Resultado + " COP");
                    historial.agregarConversion("USD", "COP", Cantidad, Resultado);
                    break;

                case 10:
                    System.out.print("Ingrese la cantidad en COP: ");
                    Cantidad = Teclado.nextDouble();
                    Resultado = calculadora.Convertir("COP", "USD", Cantidad);
                    System.out.println("Resultado: " + Resultado + " USD");
                    historial.agregarConversion("COP", "USD", Cantidad, Resultado);
                    break;

                case 11:
                    Activo = false;
            }
        }
        historial.ImprimirHistorial();
    }
}