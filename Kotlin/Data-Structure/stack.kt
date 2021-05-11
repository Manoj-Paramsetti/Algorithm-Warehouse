class Node(Data: Int) {
    public var _data = Data
    public var next : Node? = null
}

class Stack public constructor(){
    public var head : Node? = null

    fun push(data: Int){
        var temp = Node(data)
        temp.next = this.head
        this.head = temp
    }

    fun pop(){

        if(this.head == null){
            println("Underflow");
        }
        
        else{
            this.head = head?.next
        }
    }
    
    fun display(){
        
        var print_var = this.head
        if(print_var == null){
            println("Underflow")
        }
        
        while(print_var != null){
            println(print_var._data)
            print_var = print_var.next
        }
    }
}
fun main() {
    var stack = Stack()
    stack.display()
    println("Pushing 10, 20 and 30")
    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.display()
    println("Pop")
    stack.pop()
    stack.display()
}
