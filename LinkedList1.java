class Node{
    Node next;
    int data;
    Node(int new_data){
     data=new_data;
     next=null;
    }
}


public class LinkedList1 {
    public static void printList(Node head){
      while(head!=null){
        System.out.print("Node :"+head.data);
        head=head.next;
      }
      System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        // Printing the above list
        System.out.print("Linked List:");
        printList(head);


    }
    
}
