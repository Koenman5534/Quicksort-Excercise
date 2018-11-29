package nl.hva.ict.ss;

public class QuickSortLinkedList {

    /**Start setup for the doubly linked list**/
    Node head;

    /* a node of the doubly linked list */
    static class Node{
        private Player data;
        private Node next;
        private Node prev;

        //Node needs a player obj
        Node(Player player){
            data = player;
            next = null;
            prev = null;
        }
    }


    // function to find last node of linked list
    Node lastNode(Node node){
        while(node.next!=null)
            node = node.next;
        return node;
    }

    /**
     * End setup for the doubly linked list
     *
     * Start Quicksort implementation
     */

    /* Considers last element as pivot, this can be changed to mediaan or first/random*/
    private Node partition(Node l, Node p) //p stands for pivot
    {
        // set pivot as p element
        Player x = p.data;

        // same as i = l-1 for array version
        Node i = l.prev;

        // Similar to "for (int j = l; j <= h- 1; j++)"
        for(Node j=l; j!=p; j=j.next)
        {
            //First check if the data isn't empty
            if (j.data != null) {
                //Then compare J to the pivot and check if is bigger
                if (j.data.compareTo(x) >= 1) {
                    // Similar to i++ for array
                    i = (i == null) ? l : i.next;
                    Player temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        i = (i==null) ? l : i.next;  // Similar to i++
        Player temp = i.data;
        i.data = p.data;
        p.data = temp;
        return i;
    }

    /*recursive implementation of quicksort for doubly linked list */
    void _quickSort(Node l,Node h)
    {
        if(h!=null && l!=h && l!=h.next){
            Node temp = partition(l,h);
            _quickSort(l,temp.prev);
            _quickSort(temp.next,h);
        }
    }

    // The main function to sort a linked list. It mainly calls _quickSort()
    public void quickSort(Node node)
    {
        // Find last node
        Node head = lastNode(node);

        // Call the recursive QuickSort
        _quickSort(node,head);
    }

    // A utility function to print contents of arr
    public void printList(Node head)
    {
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    /* Function to insert a node at the beginging of the Doubly Linked List */
    void push(Player newPlayer)
    {
        Node new_Node = new Node(newPlayer);

        // if head is null, head is newPlayer
        if(head==null){
            head = new_Node;
            return;
        }

        /* link the old list off the new node */
        new_Node.next = head;
        /* change prev of head node to new node */
        head.prev = new_Node;
        /* since we are adding at the begining, prev is always NULL */
        new_Node.prev = null;
        /* move the head to point to the new node */
        head = new_Node;
    }

//    /* Driver program to test above function */
//    public static void main(String[] args){
//        QuickSort_using_Doubly_LinkedList list = new QuickSort_using_Doubly_LinkedList();
//
//
//        list.push(5);
//        list.push(20);
//        list.push(4);
//        list.push(3);
//        list.push(30);
//
//
//        System.out.println("Linked List before sorting ");
//        list.printList(list.head);
//        System.out.println("\nLinked List after sorting");
//        list.quickSort(list.head);
//        list.printList(list.head);
//
//    }
}


