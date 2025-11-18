package ed.u2.sorting;

import java.util.Arrays;

public class SortingTest {

    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("PRUEBAS DE ALGORITMOS DE ORDENAMIENTO ");
        System.out.println("--------------------------------------\n");

        // Casos de prueba normales
        testCase("A = [8, 3, 6, 3, 9]",
                new int[]{8, 3, 6, 3, 9},
                new int[]{3, 3, 6, 8, 9});

        testCase("B = [5, 4, 3, 2, 1] (inverso)",
                new int[]{5, 4, 3, 2, 1},
                new int[]{1, 2, 3, 4, 5});

        testCase("C = [1, 2, 3, 4, 5] (ya ordenado)",
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 3, 4, 5});

        testCase("D = [2, 2, 2, 2] (duplicados)",
                new int[]{2, 2, 2, 2},
                new int[]{2, 2, 2, 2});

        testCase("E = [9, 1, 8, 2]",
                new int[]{9, 1, 8, 2},
                new int[]{1, 2, 8, 9});

        System.out.println("\n--------------------------------------");
        System.out.println("            CASOS BORDE               ");
        System.out.println("--------------------------------------\n");

        // Casos borde
        testCase("Arreglo de tamaño 1",
                new int[]{5},
                new int[]{5});

        testCase("Todos iguales",
                new int[]{7, 7, 7, 7, 7},
                new int[]{7, 7, 7, 7, 7});

        testCase("Ya ordenado",
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 3, 4, 5});

        testCase("Orden inverso",
                new int[]{5, 4, 3, 2, 1},
                new int[]{1, 2, 3, 4, 5});

        testCase("Con duplicados",
                new int[]{3, 1, 3, 2, 1},
                new int[]{1, 1, 2, 3, 3});
    }

    public static void testCase(String description, int[] input, int[] expected) {
        System.out.println("Caso: " + description);
        System.out.println("Entrada: " + Arrays.toString(input));

        // Prueba InsertionSort
        int[] copyInsertion = input.clone();
        InsertionSort.sort(copyInsertion, false);
        boolean insertionPass = Arrays.equals(copyInsertion, expected);

        // Prueba SelectionSort
        int[] copySelection = input.clone();
        SelectionSort.sort(copySelection, false);
        boolean selectionPass = Arrays.equals(copySelection, expected);

        // Prueba BubbleSort
        int[] copyBubble = input.clone();
        BubbleSort.sort(copyBubble, false);
        boolean bubblePass = Arrays.equals(copyBubble, expected);

        System.out.println("Esperado: " + Arrays.toString(expected));
        System.out.println("InsertionSort: " + (insertionPass ? "✓ PASÓ" : "✗ FALLÓ -> " + Arrays.toString(copyInsertion)));
        System.out.println("SelectionSort: " + (selectionPass ? "✓ PASÓ" : "✗ FALLÓ -> " + Arrays.toString(copySelection)));
        System.out.println("BubbleSort:    " + (bubblePass ? "✓ PASÓ" : "✗ FALLÓ -> " + Arrays.toString(copyBubble)));
        System.out.println("--------------------------------------\n");
    }

}

