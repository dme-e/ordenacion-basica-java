package ed.u2.sorting;

public final class InsertionSort {

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean layaout) {
        int temp;
        int position;
        int counter = 0;
        int iterations = 0;

        for(int i= 1; i < array.length; i++) {
            position = i;
            temp = array[i]; //elemento del arreglo el cual vamos a comprobar

            while (position > 0 && array[position -1] > temp) {
                array[position] = array[position -1];
                position--;
                counter++;
            }

            array[position] = temp;
            iterations++;

            if (layaout)
                SortingUtils.printArray(array);
        }

        if (layaout) {
            System.out.println("--------------------------------------");
            System.out.println("Total de movimientos realizados: " + counter);
            System.out.println("Total de iteraciones realizadas: " + iterations);
        }

    }

}
