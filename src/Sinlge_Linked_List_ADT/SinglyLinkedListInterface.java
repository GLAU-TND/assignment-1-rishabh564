package Sinlge_Linked_List_ADT;

public interface SinglyLinkedListInterface<E> {
    void insertNode(E data);
    E removeFromLastPos();
    int searchNodeInLinkedList(E data);
    void printLinkedList();
}


