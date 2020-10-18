package app.datastructure;

/**
 * This class is the java own implementation of the linkedlist. Main functionalities are:
 * 1. Add integer element.
 * 2. Get the element based on data.
 * 3. Print the element
 *
 */

public class MyLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    /**
     * This method is responsible for adding integer data to the custom linkedlist.
     * @param data
     */
    public void insert(int data){
        Node new_node = new Node(data);
        new_node.next = null;
        if(this.head == null){
            this.head = new_node;
        }else{
            Node last = this.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
    }

    /**
     * This method will print the elements of the list opn console.
     */
    public void printList(){
        Node currNode = this.head;
        while(currNode != null){
           System.out.println(currNode.data);
           currNode = currNode.next;
        }
    }

    /**
     * This method is for getting the element by data.
     * @param data
     * @return
     */
    public int get(int data){
        Node currNode = this.head;
        while(currNode!=null){
            if(currNode.data == data){
                return currNode.data;
            }
            currNode = currNode.next;
        }
        return 0;
    }

    public static void main(String [] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(4);
        myLinkedList.printList();

        System.out.print("Return from the linked list"+myLinkedList.get(3));
    }

}


