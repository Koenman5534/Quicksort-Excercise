package nl.hva.ict.ss;

class QuickSort {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    public int partition(Player[] arr, int low, int high) {
        Player playerPivot = arr[high];

        // index of smaller element
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (arr[j] != null) {
                if (arr[j].compareTo(playerPivot) >= 1) {
                    i++;

                    // swap arr[i] and arr[j]
                    Player temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Player temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */

    void sort(Player arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
