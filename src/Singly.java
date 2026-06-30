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
    public void insertMid(int pos,int data)
    {
        Node m=head;
        for(int i=1;i<pos-1;i++)
        {
            m=m.next;
        }
        Node nm=new Node(data);
        Node temp=m.next;
        m.next=nm;
        nm.next=temp;


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
    public void deleteMiddle(int index)
    {
        Node h=head;
        for(int i=1;i<index-1;i++)
        {
            h=h.next;
        }
        h.next=h.next.next;
    }
    public void deleteLast()
    {
         if(head==tail)
         {
             tail=null;
             return;
         }
         Node node1=head;
         for(int i=1;i<size;i++)
         {
             node1=node1.next;

         }

         node1.next=null;

    }
    public void insertRecur(int pos,int data)
    {
           head=insertRecur(pos,data,head);
    }

    public Node insertRecur(int pos,int data,Node node)
    {
        if(pos==0)
        {
            Node temp=new Node(node, data);
            return temp;

        }

        node.next=insertRecur(pos-1,data,node.next);
        return node;
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
