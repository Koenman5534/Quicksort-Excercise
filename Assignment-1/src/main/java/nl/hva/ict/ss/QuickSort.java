package nl.hva.ict.ss;

import static javafx.application.Platform.exit;
import nl.hva.ict.ss.Player;

class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    public int partition(Player[] arr, int low, int high)
    {
        Player playerPvot = arr[low];
        long pivot = playerPvot.getHighScore();

        int i = (low-1); // index of smaller element

        for (int j=low; j <= high; j++) {

            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(playerPvot) >= 1) {
                i++;

                System.out.println(arr[j]);
                System.out.println("in de is groter dan loop " + j);

                // swap arr[i] and arr[j]
                Player temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[j].compareTo(playerPvot) <= 0 ){
                i++;

                System.out.println(arr[j]);
                System.out.println("in de is kleiner dan aan loop " + j);

                // swap arr[j] and arr[i]
                Player temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Player temp = arr[i+1];
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
        System.out.println("wat zit er in n: " + n);
        for (int i=0; i < n; ++i) {
            System.out.println(arr.toString());
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
