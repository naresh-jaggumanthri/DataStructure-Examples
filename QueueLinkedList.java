class Node{
    int data;
    Node next;
    Node(int new_data){
      data=new_data;
      next=null;
    }

}
class Queue{
    Node front,rear;
    Queue(){
        front=rear=null;

    }
    boolean isEmpty(){

        return front==null&&rear==null;
    }
    void enqueue(int new_data){
       Node new_node=new Node(new_data);
       if(rear==null){
        front=rear=new_node;

       }
        rear.next=new_node;
        rear=new_node;


    }
    void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        Node temp=front;
        front=front.next;
        if(front==null){
            rear=null;
        }

    }
    int getFront(){
       // Checking if the queue is empty
       if (isEmpty()) {
        System.out.println("Queue is empty");
        return Integer.MIN_VALUE;
    }
    return front.data;

    }
    int getRear(){
        // Checking if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;

    }

}
public class QueueLinkedList {
    public static void main(String[] args){
        Queue q = new Queue();

        // Enqueue elements into the queue
        q.enqueue(10);
        q.enqueue(20);
      
          System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());

        // Dequeue elements from the queue
        q.dequeue();
        q.dequeue();

        // Enqueue more elements into the queue
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Dequeue an element from the queue
        q.dequeue();

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());
    }
    
}
