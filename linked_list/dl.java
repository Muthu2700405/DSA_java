
import java.util.Scanner;

class Linked_list {

    private class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    public void insert_first(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insert_last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            head = head.next;

            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
        }
    }

    public void removelast() {
        if (tail == null) {
            System.out.println("Linked list is empty");
        } else {
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int getval(int idx){
        Node current = head;
        int n=0;
        while(current!=null){
            if (n==idx){
                return current.data;
            }
            n++;
            current=current.next;
        }
        return -1;
    }

    public void display_rev() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + "<-");
            current = current.prev;
        }
        System.out.print("null");

    }

    public void insert_pos(int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            insert_first(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bound");
                return;
            }
            current = current.next;
        }
        if (current == tail) {
            insert_last(data);
            return;
        }

        newNode.prev = current;
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;

    }

    public void deleteby(int val){
        Node current = head;
        while (current!=null){
            if (current.data==val){
                if (current==head) removefirst();
                else if (current== tail) removelast();
                else{
                    current.prev.next=current.next;
                    current.next.prev=current.prev;
                }
                return;
            }
            current=current.next;
        }
        System.out.println("Value not found");
    }
    public int  search(int val){
        Node current = head;
        int idx=0;
        while (current!=null){
            if (current.data==val)
                return idx;
            idx++;
            current=current.next;
        }
        return -1;
    }

}

public class dl {

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        Linked_list n1 = new Linked_list();
        Linked_list n2 = new Linked_list();
        int num = jk.nextInt();
        for (int i = 0; i < num; i++) {
            n1.insert_last(jk.nextInt());
        }
        for (int i = 0; i < num; i++) {
            n2.insert_last(jk.nextInt());
        } 
        System.out.print(n1.getval(3));
        n2.display();
    }
}
