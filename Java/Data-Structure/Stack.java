
public class Stack{
   
public static void main(String args[]){

    _Stack stack = new _Stack();
    System.out.println("===================");
    System.out.println("Push 10, 20, and 30\n==================="); 
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.display();
    System.out.println("===================");
    stack.pop();
    System.out.println("        Pop\n===================");
    stack.display();
    }   
}

class _Stack{
    private Node head;
    
    public _Stack(){
        this.head = null;
    }

    void push(int data){
        Node temp  = new Node(data);
        temp.next = this.head;
        this.head = temp;
    }

    void display(){
        var print_var = this.head;
        if(print_var == null){
            System.out.println("Underflow");
        }
        
        while(print_var != null){
            System.out.println(print_var.data);
            print_var = print_var.next;
        }
    }

    void pop(){
        if(this.head == null){
            System.out.println("Underflow");
        }
        else{
            this.head = head.next;
        }
    }

}

class Node{
    int data;
    Node next;
    public Node(int _data){
        data = _data;
        next = null; 
    }
}
