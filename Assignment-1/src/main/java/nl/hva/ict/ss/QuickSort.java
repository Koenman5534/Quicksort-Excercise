package nl.hva.ict.ss;

import static javafx.application.Platform.exit;

class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    public static <E extends Comparable<E>> int partition(E[] arr, int low, int high)
    {
        E pivot = arr[high];
        System.out.println(high);
        System.out.println(pivot);

        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] == pivot) {
                i++;

                // swap arr[i] and arr[j]
                E temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        E temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */

    void sort(Player arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(Player arr[])
    {
        System.out.println("wat gebeurt hier?");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
//    public static void main(String args[])
//    {
//        int arr[] = {10, 7, 8, 9, 1, 5};
//        int n = arr.length;
//
//        QuickSort ob = new QuickSort();
//        ob.sort(arr, 0, n-1);
//
//        System.out.println("sorted array");
//        printArray(arr);
//    }
}
