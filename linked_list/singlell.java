import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

class  Linked_list {
    Node head;
    public void insert(int data){
        Node newnode = new Node(data);
        if (head==null){
            head= newnode;
            return;
        }
        else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next=newnode;

        }
    }

    public void display(){
        Node current = head;
        while (current!=null){
             System.out.print(current.data+"->");
             current=current.next;
        }
        System.out.println("NULL");
    }

}

public class demo_linkedlist {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        Linked_list list = new Linked_list();
        int n=jk.nextInt();
        for (int i=0;i<n;i++){
            int data =jk.nextInt();
            list.insert(data);
        }
        list.display();
    }
}
