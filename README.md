# Conversor de Moneda

Este es un programa en Java que te permite convertir entre diferentes monedas utilizando la API ExchangeRate-API. El programa se ejecuta en la línea de comandos y te permite seleccionar entre varias opciones de conversión.

## Funcionalidades

- Conversión de dólares a pesos colombianos y viceversa.
- Conversión de dólares a pesos mexicanos y viceversa.
- Conversión de pesos mexicanos a pesos colombianos.

## Instalación

1. Clona este repositorio en tu máquina local:

   https://github.com/JaimeTellez/ChallengeConversorMonedas.git

2. Importa el proyecto en tu IDE de Java preferido (por ejemplo, IntelliJ IDEA).

3. Configura tu clave de API de ExchangeRate-API en el archivo "ExchangeRateAPIManager.java":

         String apiKey = "TU_CLAVE_DE_API"; // Reemplaza con tu clave de API

4. Ejecuta el programa desde tu IDE o utilizando el comando mvn exec:java si estás utilizando Maven.

Uso:

Una vez que ejecutes el programa, seguirás las instrucciones en la línea de comandos para seleccionar la conversión deseada y proporcionar la cantidad a convertir. El programa te mostrará el resultado de la conversión y te preguntará si deseas realizar otra conversión.

Dependencias:

El proyecto utiliza las siguientes dependencias de Maven:

Gson: para el manejo de JSON.
Asegúrate de que Maven descargue estas dependencias automáticamente al importar el proyecto en tu IDE.


Licencia
Este proyecto está bajo la Licencia MIT.

