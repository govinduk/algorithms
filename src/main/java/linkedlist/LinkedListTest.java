package linkedlist;

public class LinkedListTest {
    public static Node head;
    public static  class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    //print Nodes

     void prtintNodes(){
        Node pnode=head;
        while (pnode!=null){
            System.out.println(pnode.value);
            pnode=pnode.next;
        }
    }

    public static void main(String args[]){

        head= new Node(10);
        Node node20=new Node(20);
        Node node30=new Node(30);
        Node node40=new Node(40);
        Node node50=new Node(50);
        Node node60=new Node(60);

        head.next=node20;
        node20.next=node30;
        node30.next=node40;
        node40.next=node50;
        node50.next=node60;

        LinkedListTest linkedListTest=new LinkedListTest();
        linkedListTest.prtintNodes();



    }


}
