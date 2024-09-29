class StackNode{
    
    int data;
        StackNode root,next;
   
    StackNode(int new_data){
       
        data=new_data;
        root=null;

    }
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }
    boolean isEmpty(){
        if(root==null){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
    return false;
    }
    public void push(int new_data){
    
        root = new StackNode(new_data);
        StackNode temp=root;
        root.next=temp;
    }

    
}
public class StackLinkedList {
   
   
    public static void main(String[] args){
        StackNode s=new StackNode(10);
       s.push(20);
       s.push(20);
        s.push(30);

        System.out.println(s.pop()
                           + " popped from stack");

        System.out.println("Top element is " + s.peek());
    
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop()
                           + " popped from stack");

        System.out.println("Top element is " + s.peek());


    }
    
}
