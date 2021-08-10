public class BinaryTree {
    Node root;
    public boolean isMirror(Node node1, Node node2){
        if(node1==null && node2==null)
            return true;
        else if(node1!=null && node2!=null && node1.key==node2.key)
        {
            return (isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left));
        }
        return false;
    }
    
    public boolean isSymmetric()
    {
        return isMirror(root,root);
    }
    public static void main(String args[]) {
      BinaryTree tree =  new BinaryTree();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(2);
      tree.root.left.left = new Node(3);
      tree.root.left.right = new Node(4);
      tree.root.right.left = new Node(4);
      tree.root.right.right = new Node(3);

      System.out.println("Symmetric : "+tree.isSymmetric());
    }
}

class Node {
    int key;
    Node left, right;
    
    Node (int n){
        key = n;
        left = right = null;
    }
}
