class LinkedListNode
{

    private int data;
    private LinkedListNode next;


    public LinkedListNode(int data)
    {
        this.data = data;
        this.next = null;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int d)
    {
        data = d;
    }

    public LinkedListNode getNext()
    {
        return next;
    }

    public void setNext(LinkedListNode n)
    {
        next = n;
    }
}
public class LinkedList {

    public LinkedListNode head;

    public static void main(String[] args) {

    LinkedList l = new LinkedList();
    l.insertFront(0);
    l.insertBack(30);
    l.insertFront(55);
    System.out.println(l.toString());

    }

    public LinkedList() {
        this.head = null;
    }

    public int removeFront(){
        if(head == null){
            System.out.println("Error - Attempting to call removeFront() on empty list");
            return 0;
        }else{
            int temp = head.getData();
            head = head.getNext();  
            return temp;
        }

    }

    public void insertFront(int data){
        if(head == null){
            head = new LinkedListNode(data);
        }else{
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.setNext(head);
            head = newNode;
        }       
    }

    public void insertBack(int data){
        if(head == null){
            head = new LinkedListNode(data);
        }else{
            LinkedListNode newNode = new LinkedListNode(data);
            LinkedListNode current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }       
    }

    public int removeBack(){
        if(head == null){
            System.out.println("Error - Attempting to call removeBack() on empty list");
            return 0;
        }else if (head.getNext() == null){
            int temp = head.getData();
            head = null;
            return temp;
        }else{

            LinkedListNode current = head;
            while(current.getNext().getNext() != null){
                current = current.getNext();
            }
            int temp = current.getNext().getData();
            current.setNext(null);
            return temp;
        }       
    }

    public String toString(){
        String retStr = "Contents:\n";

        LinkedListNode current = head;
        while(current != null){
            retStr += current.getData() + "\n";
            current = current.getNext();

        }

        return retStr;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    } 
}
    
    
    
    
