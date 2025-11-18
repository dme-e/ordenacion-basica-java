package ed.u2.sorting;

public final class SelectionSort {

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean layaout) {
        int intercambios = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            boolean cambio = false;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }

            }

            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
                intercambios++;
                cambio = true;
            }

            if (layaout && cambio) {
                SortingUtils.printArray(array);
            }

        }

        if (layaout) {
            System.out.println("--------------------------------------");
            System.out.println("Total de intercambios realizados: " + intercambios);
        }

    }

}

