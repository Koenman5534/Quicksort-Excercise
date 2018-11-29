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

        //Doubly linked list
        QuickSortLinkedList list =  new QuickSortLinkedList();

         




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
        new QuickSortArray();
        QuickSortArray qs = new QuickSortArray();

        int high = unsorted.length;
        qs.sort((Player[]) unsorted, 0, high-1);

        //for testing purpose
//        System.out.println("sorted array:");
//        for (E pot : unsorted) {
//            System.out.println(pot + " ");
//        }

        return unsorted;
    }


}