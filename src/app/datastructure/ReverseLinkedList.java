package app.datastructure;

public class LinkedList {

    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next=null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next=null;

        while(current!= null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }

    void printList(Node node){
        while(node != null){
            System.out.println(node.data + "");
            node = node.next;
        }
    }
    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(85);
        linkedList.head.next = new Node(15);
        linkedList.head.next.next = new Node(24);

        System.out.println("the existing list");
        linkedList.printList(head);
        head = linkedList.reverse(head);
        System.out.println("Reversed Linked List");
        linkedList.printList(head);

    }
}
