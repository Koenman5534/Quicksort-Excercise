package nl.hva.ict.ss;

import java.util.LinkedList;

public class AdvancedSorts {

    /**
     * Implement quicksort using LinkedList only! Usage of anything but LinkedList will result in failing the assignment!
     *
     * @param unsorted
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> LinkedList<E> quickSort(LinkedList<E> unsorted) {

        int pivot;
        LinkedList<E> lowerSegmentList = new LinkedList<E>();
        LinkedList<E> higherSegmentList = new LinkedList<E>();



//        System.out.println(unsorted.toString());


        return unsorted;

    }

    /**
     * Implement quicksort using arrays only! Usage of anything but arrays will result in failing the assignment!
     *
     * @param unsorted
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> E[] quickSort(E[] unsorted) {
        new QuickSort();

        int high = unsorted.length;

        QuickSort ob = new QuickSort();
        ob.sort((Player[]) unsorted, 0, high);

        System.out.println("sorted array");
        QuickSort.printArray((Player[]) unsorted);

//        System.out.println(pivot);
        return unsorted;
    }


}