package TrabajoPractico;

import java.util.Scanner;

public class ExpedicionAMarte {
    // Solo para ejecución en IntelliJ/ NetBeans/ Eclipse, etc. (no funciona en terminales de Linux ni Windows)
    // No limpia realmente la consola, sino que simula un efecto de limpieza al imprimir varias líneas en blanco.
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Método para pausar la ejecución hasta que el usuario presione Enter
    public static void pausar(Scanner entrada) {
        System.out.println("Presione Enter para continuar...");
        entrada.nextLine(); // Esperamos a que el usuario presione Enter
    }

    // Método que muestra y gestiona el menú principal
    public static void menuPrincipal(Scanner entrada) {
        // Variable para almacenar la opción del usuario
        int opcion = 0;

        // Repetimos el menú hasta que el usuario seleccione salir
        do {
            limpiarConsola();

            System.out.print("*************************************************************\n");
            System.out.print("|                     Menú de opciones                      |\n");
            System.out.print("*************************************************************\n");
            System.out.print("| 1. Estado de SoVYNE (Soporte Vital y Nivel de Emergencia) |\n");
            System.out.print("| 2. Gestión ProDeLB - de Protocolos de la Base             |\n");
            System.out.print("| 3. Simulación de Trayectoria del Rover                    |\n");
            System.out.print("| 4. Análisis Secuencial de Muestras de Regolito Marciano   |\n");
            System.out.print("| 5. Salir del sistema                                      |\n");
            System.out.print("*************************************************************\n");
            System.out.print("Ingrese una opción: ");

            // Validamos que el usuario ingrese un número entero
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpiamos el buffer
            } else {
                entrada.nextLine();
                limpiarConsola();
                System.out.println("\nOpción inválida. Por favor, ingrese un número del 1 al 5.");
                pausar(entrada);
                continue;
            }

            // Evaluamos la opción seleccionada
            switch (opcion) {
                case 1:
                    limpiarConsola();
                    System.out.print("*************************************************************\n");
                    System.out.print("| 1. Estado de SoVYNE (Soporte Vital y Nivel de Emergencia) |\n");
                    System.out.print("*************************************************************\n");
                    // Agregar la lógica para mostrar el estado de SoVYNE
                    pausar(entrada);
                    break;

                case 2:
                    submenuProDeLB(entrada);
                    break;

                case 3:
                    limpiarConsola();
                    System.out.print("*************************************************************\n");
                    System.out.print("| 3. Simulación de Trayectoria del Rover                    |\n");
                    System.out.print("*************************************************************\n");
                    // Agregar la lógica para simular la trayectoria del rover
                    pausar(entrada);
                    break;

                case 4:
                    limpiarConsola();
                    System.out.print("*************************************************************\n");
                    System.out.print("| 4. Análisis Secuencial de Muestras de Regolito Marciano   |\n");
                    System.out.print("*************************************************************\n");
                    // Agregar la lógica para analizar las muestras de regolito marciano
                    pausar(entrada);
                    break;

                case 5:
                    limpiarConsola();
                    System.out.print("*************************************************************\n");
                    System.out.print("| Saliendo del sistema...                                   |\n");
                    System.out.print("*************************************************************\n");
                    pausar(entrada);
                    break;

                default:
                    limpiarConsola();
                    System.out.println("\nOpción inválida. Por favor, ingrese un número del 1 al 5.");
                    pausar(entrada);
                    break;
            }

        } while (opcion != 5); // Continuamos mostrando el menú hasta que el usuario seleccione salir
    }

    // Método que muestra y gestiona el submenú de ProDeLB
    public static void submenuProDeLB(Scanner entrada) {
        // Variable para almacenar la opción del submenú
        char subOpcion = ' ';

        limpiarConsola();

        System.out.print("*************************************************************\n");
        System.out.print("| 2. Gestión ProDeLB - de Protocolos de la Base             |\n");
        System.out.print("*************************************************************\n");
        System.out.print("|              Opciones de la Gestión ProDeLB               |\n");
        System.out.print("*************************************************************\n");
        System.out.print("| a. Invernadero hidropónico                                |\n");
        System.out.print("| b. Carga de baterías solares                              |\n");
        System.out.print("| c. Blindaje contra tormenta de polvo                      |\n");
        System.out.print("| d. Modo reposo                                            |\n");
        System.out.print("| z. Salir                                                  |\n");
        System.out.print("*************************************************************\n");
        System.out.print("Ingrese una opción: ");

        // Validamos que el usuario ingrese un solo carácter
        String input = entrada.nextLine();

        if (input.length() == 1) {
            subOpcion = input.charAt(0);
        } else {
            limpiarConsola();
            System.out.println("\n[ERROR DE SISTEMA]: Código de protocolo no reconocido por la computadora central. Operación abortada para prevenir fallas de presurización.");
            pausar(entrada);
            return;
        }

        // Evaluamos la opción seleccionada en el submenú
        switch (subOpcion) {
            case 'a':
            case 'A':
                limpiarConsola();
                System.out.print("*************************************************************\n");
                System.out.print("| a. Invernadero hidropónico                                |\n");
                System.out.print("*************************************************************\n");

                // Agregar la lógica para gestionar el invernadero hidropónico

                pausar(entrada);
                break;

            case 'b':
            case 'B':
                limpiarConsola();
                System.out.print("*************************************************************\n");
                System.out.print("| b. Carga de baterías solares                              |\n");
                System.out.print("*************************************************************\n");

                // Agregar la lógica para gestionar la carga de baterías solares

                pausar(entrada);
                break;

            case 'c':
            case 'C':
                limpiarConsola();
                System.out.print("*************************************************************\n");
                System.out.print("| c. Blindaje contra tormenta de polvo                      |\n");
                System.out.print("*************************************************************\n");

                // Agregar la lógica para gestionar el blindaje contra tormenta de polvo

                pausar(entrada);
                break;

            case 'd':
            case 'D':
                limpiarConsola();
                System.out.print("*************************************************************\n");
                System.out.print("| d. Modo reposo                                            |\n");
                System.out.print("*************************************************************\n");

                // Agregar la lógica para gestionar el modo reposo

                pausar(entrada);
                break;

            case 'z':
            case 'Z':
                limpiarConsola();
                System.out.print("*************************************************************\n");
                System.out.print("| Saliendo de la Gestión ProDeLB - de Protocolos de la Base |\n");
                System.out.print("*************************************************************\n");
                pausar(entrada);
                break;

            default:
                limpiarConsola();
                System.out.println("\n[ERROR DE SISTEMA]: Código de protocolo no reconocido por la computadora central. Operación abortada para prevenir fallas de presurización.");
                pausar(entrada);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ejecutamos el menú principal
        menuPrincipal(entrada);

        // Cerramos el Scanner para liberar recursos
        entrada.close();
    }
}
