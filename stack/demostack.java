import java.util.*;

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

class Stack{
    Node top;
    int len=0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top==null){
            top=newNode;
        }
        else{
            top.next=newNode;
            newNode.prev=top;
            top=newNode;
        }
        len++;
    }

    public void pop(){
        if (top==null){
            System.out.println("Stack is empty ");
        }
        else{
            top=top.prev;
            if (top!=null)
            top.next=null;
            len--;
        }
    }
    public void Top(){
        if (top==null){
            System.out.println("Stack is empty ");
        }
        else{
            System.out.println(top.data);
        }
    }

    public int size(){
        return len;
    }

    public void viewStack(){
        Node current = top;
        if (top==null){
            System.out.println("Stack is empty");
        }
        else{

            while (current!=null){
                System.out.println(current.data+"\n^"+"\n|");
                current=current.prev;
            }
            System.out.println("End of the stack");
        }
    }

}



public class demo_stack {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        int num = jk.nextInt();
        Stack st= new Stack();
        for (int i=0;i<num;i++){
            st.push(jk.nextInt());
        }
        st.viewStack();
        System.out.println("Size of the stack : "+st.size());
        st.Top();
        st.pop();
        System.out.println("Size of the stack : "+st.size());
        st.Top();
        st.pop();
        
        st.Top();
        st.pop();
        
        st.Top();
        st.pop();
        
        st.Top();
        st.pop();
        
        st.Top();


    }
    
}
