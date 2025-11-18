package ed.u2.sorting;

import java.util.Scanner;

public class SortingDemo {

    public static void menuPrincipal() {
        System.out.println("\n--------------------------------------");
        System.out.println("            MENÚ PRINCIPAL            ");
        System.out.println("--------------------------------------");
        System.out.println("1. Insertar valores manualmente");
        System.out.println("2. Agregar valores automáticamente");
        System.out.println("0. Salir");
        System.out.println("--------------------------------------");
    }

    public static void menuOrder() {
        System.out.println("\n--------------------------------------");
        System.out.println("         MENÚ DE ORDENAMIENTO         ");
        System.out.println("--------------------------------------");
        System.out.println("1. Ordenamiento por Burbuja");
        System.out.println("2. Ordenamiento por Selección");
        System.out.println("3. Ordenamiento por Inserción");
        System.out.println("4. Volver al menú principal");
        System.out.println("--------------------------------------");
    }

    public static void layaoutSelection() {
        System.out.println("--------------------------------------");
        System.out.println("¿Desea que se muestre el trazado?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.println("--------------------------------------");
    }

    public static int menuSelectionInitial(Scanner scanner) {
        while (true) {
            menuPrincipal();
            int size;

            System.out.println("\n--------------------------------------");
            System.out.print("Seleccione una opción: ");
            String option = scanner.next();

            switch (option) {
                case "1":

                    size = SortingUtils.giveSize(scanner);
                    return size;

                case "2":
                    System.out.println("--------------------------------------");
                    System.out.print("Ingrese el tamaño del arreglo: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("--------------------------------------");
                        System.out.println("            ENTRADA INVÁLIDA          ");
                        System.out.println("--------------------------------------");
                        scanner.next();
                    }

                    size = scanner.nextInt();
                    return -size; //se lo envía negativo por el if del main, luego se lo cambia a positivo



                case "0":
                    return 0;


                default:
                    System.out.println("----------------------------------");
                    System.out.println("--- OPCIÓN INVÁLIDA --------------");
                    System.out.print("Por favor ingrese un número entero.\n");
                    break;
            }
        }
    }

    public static void menuSelectionOrder(Scanner scanner, int[] array) {

        // Verificamos si el arreglo es nulo o está vacío antes de empezar
        if (array == null || array.length == 0) {
            System.out.println("El arreglo está vacío o no ha sido inicializado. Volviendo...");
            return;
        }

        System.out.println("------------Valor actual-----------");
        SortingUtils.print(array);


        while (true) {
            int[] copy = array.clone();

            menuOrder();
            System.out.print("Ingrese una opción de ordenamiento: ");
            String opcion = scanner.next();

            switch (opcion) {
                case "1": // Burbuja
                    layaoutSelection();
                    System.out.print("Seleccione una opción: ");
                    String trazadoB = scanner.next();
                    System.out.println("--------------------------------------");

                    if ("1".equals(trazadoB)) {
                        BubbleSort.sort(copy, true);
                    } else {
                        BubbleSort.sort(copy);
                        System.out.println("Arreglo completado: ");
                        SortingUtils.print(copy);
                    }
                    System.out.println("--------------------------------------");
                    System.out.print("Arreglo Anterior: ");
                    SortingUtils.print(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Arreglo ordenado por Burbuja.");
                    break;

                case "2": // Selección
                    layaoutSelection();
                    System.out.print("Seleccione una opción: ");
                    System.out.println("--------------------------------------");
                    String trazadoS = scanner.next();

                    if ("1".equals(trazadoS)) {
                        SelectionSort.sort(copy, true);
                    } else {
                        SelectionSort.sort(copy);
                        System.out.println("Arreglo completado: ");
                        SortingUtils.print(copy);
                    }
                    System.out.println("--------------------------------------");
                    System.out.print("Arreglo Anterior: ");
                    SortingUtils.print(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Arreglo ordenado por Selección.");
                    break;

                case "3": // Inserción
                    layaoutSelection();
                    System.out.println("Seleccione una opcion: ");
                    System.out.println("--------------------------------------");
                    String trazadoI = scanner.next();

                    if ("1".equals(trazadoI)) {
                        InsertionSort.sort(copy, true);
                    } else {
                        InsertionSort.sort(copy);
                        System.out.println("Arreglo completado: ");
                        SortingUtils.print(copy);
                    }

                    System.out.println("--------------------------------------");
                    System.out.print("Arreglo Anterior: ");
                    SortingUtils.print(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Arreglo Ordenado por Inserción.");
                    break;

                case "4":
                    System.out.println("Volviendo al menú principal...");
                    return;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("\n--------------------------------------");
        System.out.println("       PROGRAMA DE ORDENAMIENTO       ");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int size = menuSelectionInitial(scanner);
            int[] array;
            if (size == 0) {
                System.out.println("\n----------------------------------");
                System.out.println("Saliendo del programa...");
                break;
            }
            if (size > 0) {
                array = SortingUtils.fillArrayManual(size, scanner);
            } else {
                array = SortingUtils.fillArrayAuto(Math.abs(size));
            }

            menuSelectionOrder(scanner, array);
        }
        scanner.close();
    }

}
