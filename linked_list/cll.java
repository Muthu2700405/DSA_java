import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class Clinked_list{
    private Node head;
    private Node tail;
    public void add_last(int data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            head.prev=tail;
            tail.next=head;
            head.next=tail;
            tail.prev=head;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
        }
    }

    public void add_first(int data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            head.prev=tail;
            tail.next=head;
            head.next=tail;
            tail.prev=head;
        }
        else{
            newNode.next=head;
            newNode.prev=tail;
            tail.next=newNode;
            head=newNode;
        }
    }

    public void display() {
        Node current = head;
        while (true) {
            System.out.print(current.data + "->");
            current = current.next;
            if (current==head){
                break;
            }
        }
        System.out.print("head");
    }

}

public class cll {
    public static void main(String [] args){
        Scanner jk = new Scanner(System.in);
        Clinked_list n1= new Clinked_list();

        int num = jk.nextInt();

        for (int i = 0; i < num; i++) {
            n1.add_last(jk.nextInt());
        }

        n1.display();
        jk.close();
    }

}
