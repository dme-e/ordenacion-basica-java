package ed.u2.sorting;

public final class BubbleSort {

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean layaout) {
        int counter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                    counter++;

                    if (layaout) {
                        SortingUtils.print(array);
                    }
                }
            }

            if (!swapped) {
                if (layaout && counter==0) {
                    System.out.println("No hubo intercambios");
                }
                break;
            }
        }

        if (layaout) {
            System.out.println("--------------------------------------");
            System.out.println("Total de intercambios: " + counter);
        }
    }
}
