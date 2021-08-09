public class SinglyLinkedList {
    
    Node head;
    
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public void printList(){
        Node currentNode = head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"\t");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    
     public int nodeCount(){
        Node currentNode = head;
        int len=0;
        while(currentNode!=null)
        {
            len++;
            currentNode = currentNode.next;
        }
        return len;
    }
    
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head!=null) {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        } else {
            head = newNode;
        }
    }
    
    public void printNthLastNode(int n){
        int len = nodeCount();
        Node temp = head;
        if(len<n)
            return;
        for(int i=0;i<len-n;i++)
            temp=temp.next;
        System.out.println("3rd Last node is "+temp.data);
    }
    
    public static void main(String args[]) {
      SinglyLinkedList list = new SinglyLinkedList();
      list.addNode(1);
      list.addNode(2);
      list.addNode(3);
      list.addNode(4);
      list.printList();
      
      System.out.println("Length is "+list.nodeCount());
      list.printNthLastNode(3);
    }
    
}
