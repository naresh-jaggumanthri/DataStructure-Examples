class Node{
    String data;
    Node next;
    Node(String new_data){
        data=new_data;
        next=null;
    }
    String getData(){
    return data;
    }
    void setData(String newData){
       this.data=newData; 
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}

public class RPSLinkedList {
    public Node head;
    public static void main(String[] args){
        int result=0;
        RPSLinkedList r=new RPSLinkedList();
        String[] input={"2","1","+","3","*"};
        for(int i=0;i<input.length;i++){
        
        if(input[i]=="+"){
            result=Integer.parseInt(r.removeFront())+Integer.parseInt(r.removeFront());
            r.removeFront();
            r.insertFront(String.valueOf(result));
        }else if(input[i]=="-"){
            result=Integer.parseInt(r.removeFront())-Integer.parseInt(r.removeFront());
            r.removeFront();
            r.insertFront(String.valueOf(result));
        }else if(input[i]=="*"){
            result=Integer.parseInt(r.removeFront())*Integer.parseInt(r.removeFront());
            r.removeFront();
            r.insertFront(String.valueOf(result));
        }else if(input[i]=="/"){
            result=Integer.parseInt(r.removeFront())/Integer.parseInt(r.removeFront());
            r.removeFront();
            r.insertFront(String.valueOf(result));
        }else{
        r.insertFront(input[i]);
        }
    }
       // int res=s.sumRps();
        System.out.println("Sum is:"+r.toString());
        System.out.println("Sum is:"+result);
      //  s.printList(s.root);

    }
   RPSLinkedList(){
    this.head=null;
   }
   

public String removeFront(){
    if(head == null){
        System.out.println("Error - Attempting to call removeFront() on empty list");
        return "0";
    }else{
        String temp = head.getData();
        head = head.getNext();  
        return temp;
    }

}

public void insertFront(String data){
    if(head == null){
        head = new Node(data);
    }else{
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }       
}

public void insertBack(String data){
    if(head == null){
        head = new Node(data);
    }else{
        Node newNode = new Node(data);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
    }       
}

public String removeBack(){
    if(head == null){
        System.out.println("Error - Attempting to call removeBack() on empty list");
        return "0";
    }else if (head.getNext() == null){
        String temp = head.getData();
        head = null;
        return temp;
    }else{

        Node current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        String temp = current.getNext().getData();
        current.setNext(null);
        return temp;
    }       
}

public String toString(){
    String retStr = "Contents:\n";

    Node current = head;
    while(current != null){
        retStr += current.getData() + "\n";
        current = current.getNext();

    }

    return retStr;
}

public Node getHead() {
    return head;
}

public void setHead(Node head) {
    this.head = head;
} 
   
}
