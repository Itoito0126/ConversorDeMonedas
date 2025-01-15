# Conversor de Monedas

Este proyecto es una aplicación Java para realizar conversiones entre distintas monedas utilizando datos actualizados. También incluye funcionalidades para registrar y consultar un historial de conversiones realizadas.

## Características

- Conversión entre múltiples monedas.
- Consulta de tasas de conversión actualizadas mediante una API.
- Registro automático de un historial de conversiones.
- Interfaz de usuario basada en menús.

## Estructura del Proyecto

```
ConversorDeMonedas-main/
|
|-- README.md               # Información sobre el proyecto.
|-- ConversorDeMoneda.iml   # Configuración del proyecto para IntelliJ IDEA.
|-- Historial.json          # Archivo de registro para el historial de conversiones.
|-- src/                    # Código fuente principal.
|   |-- API.java            # Clase para gestionar la comunicación con la API.
|   |-- APIConversionRates.java # Clase para manejar tasas de conversión.
|   |-- APIMonedas.java     # Clase para manejar las monedas disponibles.
|   |-- CalculadoraCambio.java # Lógica para calcular conversiones.
|   |-- Historial.java      # Clase para manejar el historial de conversiones.
|   |-- Main.java           # Punto de entrada de la aplicación.
|   |-- Menu.java           # Interfaz de usuario.
|-- out/                    # Archivos compilados.
```

## Requisitos

- **Java 17** o superior.
- Conexión a Internet para obtener tasas de cambio actualizadas.
- Entorno de desarrollo compatible (opcional): IntelliJ IDEA o similar.

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/Itoito0126/ConversorDeMonedas.git
   ```

2. Abre el proyecto en tu entorno de desarrollo favorito.
3. Asegúrate de que el SDK de Java esté configurado correctamente.
4. Ejecuta la clase `Main.java` para iniciar la aplicación.

## Uso

1. Ejecuta la aplicación.
2. Sigue las instrucciones en pantalla para seleccionar la moneda de origen y destino.
3. Ingresa el monto a convertir.
4. Consulta el resultado y revisa el historial de conversiones si es necesario.

## Autor

Desarrollado por Alejandro Muñoz Córdoba. Si tienes preguntas o sugerencias, no dudes en contactarme.

