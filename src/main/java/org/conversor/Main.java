package org.conversor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateAPIManager apiManager = new ExchangeRateAPIManager();

        boolean salir = false;

        while (!salir) {

        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Dólares a Pesos Colombianos");
        System.out.println("2. Pesos Colombianos a Dólares");
        System.out.println("3. Dólares a Pesos Mexicanos");
        System.out.println("4. Pesos Mexicanos a Dólares");
        System.out.println("5. Pesos Mexicanos a Pesos Colombianos");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
        int option = scanner.nextInt();

        try {
            double amount, result;
            String respuesta;
            switch (option) {
                case 1:

                    do {

                    System.out.print("Ingrese la cantidad en dólares: ");
                    amount = scanner.nextDouble();
                    result = amount * apiManager.getExchangeRate("USD", "COP");
                    System.out.println("El equivalente en pesos colombianos es: " + result);
                    System.out.print("¿Desea hacer otra conversión? (Sí/No): ");
                    respuesta = scanner.next().toLowerCase();
                    } while (respuesta.equals("si") || respuesta.equals("sí"));
                    break;

                case 2:

                    do {
                    System.out.print("Ingrese la cantidad en pesos colombianos: ");
                    amount = scanner.nextDouble();
                    result = amount * apiManager.getExchangeRate("COP", "USD");
                    System.out.println("El equivalente en dolares es: " + result);
                    System.out.print("¿Desea hacer otra conversión? (Sí/No): ");
                    respuesta = scanner.next().toLowerCase();
                    } while (respuesta.equals("si") || respuesta.equals("sí"));
                    break;
                case 3:

                    do {
                    System.out.print("Ingrese la cantidad en dólares: ");
                    amount = scanner.nextDouble();
                    result = amount * apiManager.getExchangeRate("USD", "MXN");
                    System.out.println("El equivalente en pesos mexicanos es: " + result);
                    System.out.print("¿Desea hacer otra conversión? (Sí/No): ");
                    respuesta = scanner.next().toLowerCase();
                    } while (respuesta.equals("si") || respuesta.equals("sí"));
                    break;
                case 4:

                    do {
                    System.out.print("Ingrese la cantidad en pesos mexicanos: ");
                    amount = scanner.nextDouble();
                    result = amount * apiManager.getExchangeRate("MXN", "USD");
                    System.out.println("El equivalente en dolares es: " + result);
                    System.out.print("¿Desea hacer otra conversión? (Sí/No): ");
                    respuesta = scanner.next().toLowerCase();
                    } while (respuesta.equals("si") || respuesta.equals("sí"));
                    break;
                case 5:

                    do {
                    System.out.print("Ingrese la cantidad en pesos mexicanos: ");
                    amount = scanner.nextDouble();
                    result = amount * apiManager.getExchangeRate("MXN", "COP");
                    System.out.println("El equivalente en pesos colombianos es: " + result);
                    System.out.print("¿Desea hacer otra conversión? (Sí/No): ");
                    respuesta = scanner.next().toLowerCase();
                    } while (respuesta.equals("si") || respuesta.equals("sí"));
                    break;
                case 6:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } catch (IOException e) {
            System.out.println("Error al obtener las tasas de cambio: " + e.getMessage());
        }
    }
        System.out.println("Gracias por usar el conversor de moneda.");
    }
}