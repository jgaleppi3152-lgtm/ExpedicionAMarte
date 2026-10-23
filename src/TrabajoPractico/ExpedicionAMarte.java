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

    // Método que muestra logo
    public static void mostrarLogo() {
        System.out.print("*************************************************************\n");
        System.out.print("|                                                           |\n");
        System.out.print("|        OOOOO   DDDD   III  SSSSS  SSSSS  EEEEE  Y   Y     |\n");
        System.out.print("|       O     O  D   D   I   S      S      E       Y Y      |\n");
        System.out.print("|       O     O  D   D   I   SSSSS  SSSSS  EEEE     Y       |\n");
        System.out.print("|       O     O  D   D   I       S      S  E        Y       |\n");
        System.out.print("|        OOOOO   DDDD   III  SSSSS  SSSSS  EEEEE    Y       |\n");
        System.out.print("|                                                           |\n");
        System.out.print("|------- PROGRAMMING OUR WAY TO A BETTER TOMORROW ----------|\n");
        System.out.print("|-----------------------------------------------------------|\n");
    }

    // Método que muestra y gestiona el menú principal
    public static void menuPrincipal(Scanner entrada) {

        int opcion = 0;
        int intentosIncorrectos = 0;

        // Repetimos el menú hasta que el usuario seleccione salir
        do {
            opcion = 0;

            limpiarConsola();
            mostrarLogo();

            System.out.print("*************************************************************\n");
            System.out.print("|                      Menú del Odissey                     |\n");
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
                        mostrarLogo();
                        System.out.print("*************************************************************\n");
                        System.out.print("| 1. Estado de SoVYNE (Soporte Vital y Nivel de Emergencia) |\n");
                        System.out.print("*************************************************************\n");
                        mostrarEstadoSoVYNE(entrada);
                        break;

                    case 2:
                        submenuProDeLB(entrada);
                        break;

                    case 3:
                        limpiarConsola();
                        mostrarLogo();
                        System.out.print("*************************************************************\n");
                        System.out.print("| 3. Simulación de Trayectoria del Rover                    |\n");
                        System.out.print("*************************************************************\n");
                        simularTrayectoriaRover(entrada);
                        break;

                    case 4:
                        limpiarConsola();
                        mostrarLogo();
                        System.out.print("*************************************************************\n");
                        System.out.print("| 4. Análisis Secuencial de Muestras de Regolito Marciano   |\n");
                        System.out.print("*************************************************************\n");
                        analizarMuestrasRegolito(entrada);
                        break;

                    case 5:
                        limpiarConsola();
                        mostrarLogo();
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
        mostrarLogo();

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
                mostrarLogo();
                System.out.print("*************************************************************\n");
                System.out.print("| a. Invernadero hidropónico                                |\n");
                System.out.print("*************************************************************\n");
                gestionarInvernaderoHidroponico(entrada);
                break;

            case 'b':
            case 'B':
                limpiarConsola();
                mostrarLogo();
                System.out.print("*************************************************************\n");
                System.out.print("| b. Carga de baterías solares                              |\n");
                System.out.print("*************************************************************\n");
                gestionarCargaBateriasSolares(entrada);
                break;

            case 'c':
            case 'C':
                limpiarConsola();
                mostrarLogo();
                System.out.print("*************************************************************\n");
                System.out.print("| c. Blindaje contra tormenta de polvo                      |\n");
                System.out.print("*************************************************************\n");
                gestionarBlindajeTormentaPolvo(entrada);
                break;

            case 'd':
            case 'D':
                limpiarConsola();
                mostrarLogo();
                System.out.print("*************************************************************\n");
                System.out.print("| d. Modo reposo                                            |\n");
                System.out.print("*************************************************************\n");
                gestionarModoReposo(entrada);
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

    // Inicio Estado de SoVYNE (Soporte Vital y Nivel de Emergencia)
    // Metodo para mostrar el estado de SoVYNE
    public static void mostrarEstadoSoVYNE(Scanner entrada) {
        System.out.print("\nDesarrollando la funcionalidad de Estado de SoVYNE...\n");
        pausar(entrada);
    }
    // Fin Estado de SoVYNE (Soporte Vital y Nivel de Emergencia)

    // Inicio Gestión de Protocolos de la Base (ProDeLB)
    // Inicio Gestión de Invernadero Hidropónico
    // Método para gestionar el invernadero hidropónico
    public static void gestionarInvernaderoHidroponico(Scanner entrada) {
        System.out.print("\nDesarrollando la funcionalidad de Gestión de Invernadero Hidropónico...\n");
        pausar(entrada);
    }
    // Fin Gestión de Invernadero Hidropónico

    // Inicio Gestión de Carga de Baterías Solares
    // Método para gestionar la carga de baterías solares
    public static void gestionarCargaBateriasSolares(Scanner entrada) {
        System.out.print("\nDesarrollando la funcionalidad de Gestión de Carga de Baterías Solares...\n");
        pausar(entrada);
    }
    // Fin Gestión de Carga de Baterías Solares

    // Inicio Gestión de Blindaje contra Tormenta de Polvo
    // Método para gestionar el blindaje contra tormenta de polvo
    public static void gestionarBlindajeTormentaPolvo(Scanner entrada) {
        System.out.print("\nDesarrollando la funcionalidad de Gestión de Blindaje contra Tormenta de Polvo...\n");
        pausar(entrada);
    }
    // Fin Gestión de Blindaje contra Tormenta de Polvo

    // Inicio Gestión de Modo Reposo
    // Método para gestionar el modo reposo
    public static void gestionarModoReposo(Scanner entrada) {
        System.out.print("\nDesarrollando la funcionalidad de Gestión de Modo Reposo...\n");
        pausar(entrada);
    }
    // Fin Gestión de Modo Reposo
    // Fin Gestión de Protocolos de la Base (ProDeLB)

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

                if (distanciaObjetivo <= 0 || distanciaObjetivo > 20) {
                    System.out.print("Distancia inválida. Debe ser un número positivo y no mayor a 20 km.\n");
                }
            } else {
                entrada.nextLine();
                System.out.print("Entrada inválida. Por favor, ingrese un número.\n");
            }
        } while (distanciaObjetivo <= 0 || distanciaObjetivo > 20);

        // Inicializamos la distancia restante con la distancia objetivo
        distanciaRestante = distanciaObjetivo;

        // Solicitamos al usuario el número total de soles a simular
        do {
            System.out.print("Ingrese el número total de tramos o soles a simular: ");

            if (entrada.hasNextInt()) {
                totalSoles = entrada.nextInt();
                entrada.nextLine();

                if (totalSoles <= 0 || totalSoles > 6) {
                    System.out.println("Número de soles inválido. Debe ser un número positivo y no mayor a 6.\n");
                }
            } else {
                entrada.nextLine();
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.\n");
            }
        } while (totalSoles <= 0 || totalSoles > 6);

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

    // Inicio Análisis Secuencial de Muestras de Regolito Marciano
    // Método para Análisis Secuencial de Muestras de Regolito Marciano
    public static void analizarMuestrasRegolito(Scanner entrada) {
        int cantidadMuestras;
        double porcentajeHierro;
        char tienePerclorato;

        double sumaHierro = 0;
        double maxHierro = -1;
        int muestraMaxHierro = 0;
        int contadorToxicas = 0;

        System.out.println( "ANÁLISIS SECUENCIAL DE MUESTRAS DE REGOLITO MARCIANO");

        do {
            System.out.print("Ingrese la cantidad de muestras a evaluar: ");

            //Verificamos que el usuario ingrese un numero entero
            while(!entrada.hasNextInt()) {
                System.out.println("Error: debe ingresar un número entero.");
                entrada.next();
                System.out.print("Ingrese la cantidad de muestras a evaluar: ");
            }

            cantidadMuestras = entrada.nextInt();

            // Verificamos que el valor ingresado sea mayor a cero
            if(cantidadMuestras <= 0){
                System.out.print("Error: la cantidad debe ser mayor a cero. Intente nuevamente.\n");
            }

        } while (cantidadMuestras <= 0);

        // Solicitamos al usuario que ingrese valores de porcentaje de óxido de hierro y presencia de sales de perclorato para cada muestra
        for(int i=1; i <= cantidadMuestras; i++){
            System.out.println();
            System.out.println("Muestra " + i + "de " + cantidadMuestras);

            // Bloque para solicitar al usuario que ingrese el porcentaje de oxido de hierro
            do{
                System.out.println("Ingrese porcentaje de óxido de hierro Fe203 (0-100): ");

                // Validamos que el usuario ingrese un numero real
                while(!entrada.hasNextDouble()){
                    System.out.println("Error; debe ingresar un número real.");
                    entrada.next();
                    System.out.println("Ingrese porcentaje de óxido de hierro Fe203 (0-100): ");
                }

                porcentajeHierro = entrada.nextDouble();

                // Validamos que el porcentaje ingresado sea un valor entre 0 y 100
                if(porcentajeHierro < 0 || porcentajeHierro > 100){
                    System.out.println("Error: el porcentaje debe estar entre 0 y 100");
                }

            } while (porcentajeHierro < 0 || porcentajeHierro > 100);

            // Bloque para solicitar al usuario que indique si la muestra tiene sales de perclorato
            do{
                System.out.print("Tiene sales de perclorato? (s/n): ");
                tienePerclorato = entrada.next().charAt(0);

                if(tienePerclorato != 's' && tienePerclorato != 'S' && tienePerclorato != 'n' && tienePerclorato != 'N'){
                    System.out.println("Error: debe ingresar 's' para Sí o 'n' para No.");
                }

            } while(tienePerclorato != 's' && tienePerclorato != 'S' && tienePerclorato != 'n' && tienePerclorato != 'N');

            // Acumulamos los porcentajes de oxido de hierro
            sumaHierro += porcentajeHierro;

            if(porcentajeHierro > maxHierro){
                // Actualizamos el valor maximo de oxido de hierro y la muestra correspondiente
                maxHierro = porcentajeHierro;
                muestraMaxHierro = i;
            }

            if(tienePerclorato == 's' || tienePerclorato == 'S'){
                // Contamos las muestras con presencia de sales de perclorato
                contadorToxicas++;
            }

            // Mostramos reporte de la muestra procesada
            System.out.println("Reporte de muestra:");
            System.out.println("Número de muestra procesada: " + i);
            System.out.println("Porcentaje de Fe203: " + porcentajeHierro + "%");
            
            // Mostramos la condicion de presencia de sales de perclorato segun la respuesta del usuario
            if(tienePerclorato == 's' || tienePerclorato == 'S'){
                System.out.println("Condición observada: presencia de sales de perclorato.");
            }else{
                System.out.println("Condición observada: sin presencia de sales de perclorato.");
            }
        }

        // Calculamos el promedio de oxido de hierro y el porcentaje de toxicidad del lote
        double promedioHierro = sumaHierro / cantidadMuestras;
        double porcentajeToxicidad = (contadorToxicas * 100.0) / cantidadMuestras;

        // Mostramos el reporte final del lote de muestras
        System.out.println();
        System.out.println("REPORTE FINAL DEL LOTE");
        System.out.println("Total de muestras procesadas: " + cantidadMuestras);
        System.out.printf("Promedio de oxido de hierro: %.2f%%\n", promedioHierro);
        System.out.println("Muestra con mayor concentración: muestra " + muestraMaxHierro + " con " + maxHierro + "%" );
        System.out.printf("Porcentaje de toxicidad del lote: %.2f%%\n", porcentajeToxicidad);

        // Evaluamos si el lote es apto para extraccion y fundicion de metales segun los criterios establecidos
        if(promedioHierro > 45.0 && porcentajeToxicidad < 25.0){
            System.out.println("LOTE APTO: Aprobado para extraccion y fundición de metales");
        }else {
            System.out.println("LOTE DESCARTADO: Alta concentración de sales tóxicas o bajo rendimiento mineral.");
        }

        // Limpiamos el buffer del Scanner
        entrada.nextLine();
        pausar(entrada);
    }
    // Fin Análisis Secuencial de Muestras de Regolito Marciano

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ejecutamos el menú principal
        menuPrincipal(entrada);

        // Cerramos el Scanner para liberar recursos
        entrada.close();
    }
}
