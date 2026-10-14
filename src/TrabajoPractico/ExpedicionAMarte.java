package TrabajoPractico;

import java.util.Scanner;

public class ExpedicionAMarte {
    // No limpia realmente la consola, sino que simula un efecto de limpieza al imprimir varias líneas en blanco.
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Método para pausar la ejecución
    public static void pausar(Scanner entrada) {
        System.out.print("Presione Enter para continuar...");
        entrada.nextLine(); // Esperamos a que el usuario presione Enter
    }

    // Método que muestra y gestiona el menú principal
    public static void menuPrincipal(Scanner entrada) {

        int opcion = 0;
        int intentosIncorrectos = 0;

        // Repetimos el menú hasta que el usuario seleccione salir
        do {
            opcion = 0;
            limpiarConsola();

            System.out.print("*************************************************************\n");
            System.out.print("|                     Menú de opciones                      |\n");
            System.out.print("*************************************************************\n");
            System.out.print("| 1. Estado de SoVYNE (Soporte Vital y Nivel de Emergencia) |\n");
            System.out.print("| 2. Gestión de Protocolos de la Base (ProDeLB)             |\n");
            System.out.print("| 3. Simulación de Trayectoria del Rover                    |\n");
            System.out.print("| 4. Análisis Secuencial de Muestras de Regolito Marciano   |\n");
            System.out.print("| 5. Salir del sistema                                      |\n");
            System.out.print("*************************************************************\n");
            System.out.print("Ingrese una opción: ");

            // Validamos que el usuario ingrese un número entero
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                entrada.nextLine();

                if(opcion < 1 || opcion > 5) {
                    intentosIncorrectos++;
                    limpiarConsola();
                    System.out.println("\nOpción inválida. Por favor, ingrese un número del 1 al 5.");
                    System.out.println("Te quedan " + (3 - intentosIncorrectos) + " intentos. Después de 3 intentos incorrectos, el sistema se cerrará.");

                    if(intentosIncorrectos < 3) {
                        pausar(entrada);
                    }
                }
            } else {
                entrada.nextLine();
                intentosIncorrectos++;
                limpiarConsola();
                System.out.println("\nOpción inválida. Por favor, ingrese un número del 1 al 5.");
                System.out.println("Te quedan " + (3 - intentosIncorrectos) + " intentos. Después de 3 intentos incorrectos, el sistema se cerrará.");

                if(intentosIncorrectos < 3) {
                    pausar(entrada);
                }
            }

            // Si el usuario ha ingresado 3 opciones incorrectas, mostramos un mensaje de error
            if (intentosIncorrectos >= 3) {
                System.out.print("\n*************************************************************\n");
                System.out.print("| ERROR DE SISTEMA: Operación abortada.                     |\n");
                System.out.print("| Se alcanzó el límite de intentos permitidos.              |\n");
                System.out.print("*************************************************************\n");
                break;
            }

            // Evaluamos la opción seleccionada
            if (opcion >=1 && opcion <= 5) {
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
                        simularTrayectoriaRover(entrada);
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
            }

        } while (opcion != 5 && intentosIncorrectos < 3);
    }

    // Método que muestra y gestiona el submenú de ProDeLB
    public static void submenuProDeLB(Scanner entrada) {

        char subOpcion = ' ';

        limpiarConsola();

        System.out.print("*************************************************************\n");
        System.out.print("| 2. Gestión de Protocolos de la Base (ProDeLB)             |\n");
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
            System.out.println("\nERROR DE SISTEMA: Código de protocolo no reconocido por la computadora central. Operación abortada para prevenir fallas de presurización.");
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
                System.out.println("\nERROR DE SISTEMA: Código de protocolo no reconocido por la computadora central. Operación abortada para prevenir fallas de presurización.");
                pausar(entrada);
                break;
        }
    }

    // Inicio Simulación de Trayectoria del Rover
    // Método para Simulación de Trayectoria del Rover
    public static void simularTrayectoriaRover(Scanner entrada) {
        // Declaramos la variable para la distancia objetivo
        double distanciaObjetivo = 0.0;

        // Declaramos la variable para el número total de soles a simular
        int totalSoles = 0;

        // Inicializamos variables para la simulación
        double bateria = 100.0;
        double distanciaRecorrida = 0.0;
        double distanciaRestante = 0.0;

        int solesOperados = 0;

        // Solicitamos al usuario la distancia entre la base y el cráter
        do {
            System.out.print("\nIngrese la distancia entre la base y el cráter: ");

            if (entrada.hasNextDouble()) {
                distanciaObjetivo = entrada.nextDouble();
                entrada.nextLine();

                if (distanciaObjetivo <= 0 || distanciaObjetivo > 50) {
                    System.out.print("Distancia inválida. Debe ser un número positivo y no mayor a 50 km.\n");
                }
            } else {
                entrada.nextLine();
                System.out.print("Entrada inválida. Por favor, ingrese un número.\n");
            }
        } while (distanciaObjetivo <= 0 || distanciaObjetivo > 50);

        // Inicializamos la distancia restante con la distancia objetivo
        distanciaRestante = distanciaObjetivo;

        // Solicitamos al usuario el número total de soles a simular
        do {
            System.out.print("Ingrese el número total de tramos o soles a simular: ");

            if (entrada.hasNextInt()) {
                totalSoles = entrada.nextInt();
                entrada.nextLine();

                if (totalSoles <= 0 || totalSoles > 20) {
                    System.out.println("Número de soles inválido. Debe ser un número positivo y no mayor a 20.\n");
                }
            } else {
                entrada.nextLine();
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.\n");
            }
        } while (totalSoles <= 0 || totalSoles > 20);

        // Simulamos la travesía sol a sol
        for (int sol = 1; sol <= totalSoles; sol++) {

            double avanceDelDia = calcularAvanceDelDia(sol);

            // Aseguramos que el avance del día no sea negativo y que no supere la distancia restante
            if (avanceDelDia < 0) {
                avanceDelDia = 0;
            }

            if (avanceDelDia > distanciaRestante) {
                avanceDelDia = distanciaRestante;
            }

            // Calculamos la distancia recorrida acumulada y actualizamos la distancia restante
            distanciaRecorrida += avanceDelDia;
            distanciaRestante = distanciaObjetivo - distanciaRecorrida;

            // Calculamos el desgaste de batería del día y actualizamos el nivel
            double bateriaConsumida = calcularConsumoBateria(sol);
            bateria -= bateriaConsumida;

            if (bateria < 0) {
                bateria = 0;
            }

            // Incrementamos el contador de soles efectivos operados
            solesOperados++;

            // Reporte del día
            System.out.print("\n*************************************************************\n");
            System.out.printf("Sol %d:\n", sol);
            System.out.printf("  Avance efectivo del día: %.2f km\n", avanceDelDia);
            System.out.printf("  Distancia recorrida: %.2f km\n", distanciaRecorrida);
            System.out.printf("  Distancia restante: %.2f km\n", distanciaRestante);
            System.out.printf("  Desgaste de batería: %.2f%%\n", bateriaConsumida);
            System.out.printf("  Nivel de batería restante: %.2f%%\n", bateria);

            // Condiciones de terminación de la simulación
            if (bateria < 10.0) {
                System.out.println("\nBatería Crítica: Deteniendo avance para recarga solar estática.");
                break;
            }

            if (distanciaRecorrida >= distanciaObjetivo) {
                System.out.println("\nMeta alcanzada: Arribo exitoso al objetivo.");
                break;
            }

            if (sol == totalSoles) {
                System.out.println("\nSoles insuficientes: Deteniendo avance, con los soles especificados no se puede llegar al cráter.");
                break;
            }
        }

        // Reporte final de la expedición
        System.out.print("\n*************************************************************\n");
        System.out.print("Informe final de la expedición:\n");
        System.out.printf("  Soles efectivos operados: %d\n", solesOperados);
        System.out.printf("  Distancia total recorrida: %.2f km\n", distanciaRecorrida);
        System.out.printf("  Distancia restante: %.2f km\n", distanciaRestante);
        System.out.printf("  Nivel final de batería: %.2f%%\n", bateria);
        System.out.println();

        // Diagnóstico final
        if (distanciaRecorrida >= distanciaObjetivo && bateria >= 10.0) {
            System.out.print("ESTADO: Éxito total de la misión. Muestras geológicas listas para recolección.\n");
        } else if (distanciaRecorrida < distanciaObjetivo && bateria >= 10.0) {
            System.out.print("ESTADO: Misión inconclusa por límite de tiempo. Rover a la espera de nueva ventana de comando.\n");
        } else if (bateria < 10.0) {
            System.out.print("ESTADO: Falla por energía. Rover varado, requiere despliegue de paneles de emergencia.\n");
        }

        System.out.println("*************************************************************\n");
        pausar(entrada);
    }

    // Método Avance efectivo del día
    public static double calcularAvanceDelDia(int sol) {
        double avanceDelDia = 4.5 - (sol * 0.2);
        return Math.max(avanceDelDia, 0); // Aseguramos que el avance no sea negativo
    }

    // Método Consumo de batería del día
    public static double calcularConsumoBateria(int sol) {
        double consumoBateria = 12.0 + (sol * 1.5);
        return consumoBateria;
    }
    // Fin Simulación de Trayectoria del Rover

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ejecutamos el menú principal
        menuPrincipal(entrada);

        // Cerramos el Scanner para liberar recursos
        entrada.close();
    }
}
