import java.util.Vector;


class TreeDs{
    public static void main(String[] args){
 // Number of nodes
 int N = 7,Root = 1;
  // Adjacency list to store the tree
  Vector<Vector<Integer>> adj=new Vector<Vector<Integer>>();
  for (int i = 0; i < N + 1; i++) {
    adj.add(new Vector<Integer>());
}
//creating the tree
adj.get(1).add(2);
adj.get(2).add(1);

adj.get(1).add(3);
adj.get(3).add(1);

adj.get(1).add(4);
adj.get(4).add(1);

adj.get(2).add(5);
adj.get(5).add(2);

adj.get(2).add(6);
adj.get(6).add(2);

adj.get(4).add(7);
adj.get(7).add(4);

// Printing the parents of each node
System.out.println("The parents of each node are:");
printParents(Root, adj, 0);
    }

    public static void printParents(int node,Vector<Vector<Integer>> adj,int parent){
       if(parent==0){
        System.out.println(node + "->Root");
       }else{
        System.out.println(node + "->" + parent);
       }
       //DFS
       for(int i=0;i<adj.get(node).size();i++)
       if(adj.get(node).get(i)!=parent)
       printParents(adj.get(node).get(i),adj,node);


    }
}