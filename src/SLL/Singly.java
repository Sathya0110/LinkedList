package SLL;

public class Singly {
    private Node head;
    private Node tail;
    private int size=0;

    public class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }
    }
    public void insertFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;

    }
    public void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("There is no element to delete");
            return;
        }
        head=head.next;
    }
    public void deleteMiddle()
    {

    }
    public void deleteLast()
    {

    }

    public void display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.print("End");
    }




}
