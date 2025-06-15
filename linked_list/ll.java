import java.util.Scanner;

class Linked {

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void insert_first(int data){
        Node newNode = new Node(data);
        if (head == null){
            head=tail=newNode;
        }
        else {
            newNode.next=head;
            head= newNode;
        }
    }
    public void insert_last(int data){
        Node newNode = new Node(data);
        if (head == null){
            head=tail=newNode;
        }
        else {
            tail.next=newNode;
            tail= newNode;
        }
    }

    public void removefirst(){
        if (head==null){
            System.out.println("Linked list is empty");
        }
        else{
            head=head.next;
            if (head==null){
                tail=null;
            }
        }
    }
    
    public Node swap_pair(){
        if (head == null){
            return null;
        }
        Node c = head; 
        Node dummy = new Node(0);
        Node current = dummy;
        current=c.next;
        current.next=c;
        head=dummy;
        
    }

    public void duplicate(){
        Node current = head;
        while (current.next != null){
            if (current.data == current.next.data){
                current.next=current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public void display(){
        Node current= head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

}

public class ll {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        Linked nn = new Linked();
        int num=jk.nextInt();
        for (int i=0;i<num;i++){
            nn.insert_last(jk.nextInt());
        }
        nn.display();
        nn.swap_pair()
        nn.display();
    }

}
