package DLL;


public class Doubly {
    private Node head;
    private Node tail;


    public class Node
    {
        Node prev;
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }



    }
    public
    void insertFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public void inserEnd(int data)
    {
        Node tail;
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertEnd(int data)
    {

        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;



    }
    public void insertMid(int pos,int data)
    {
        Node m=head;
        for(int i=1;i<pos-1;i++)
        {
            m=m.next;
        }
        Node x=new Node(data);
        Node temp=m.next;
        m.next=x;
        x.prev=m;
        x.next=temp;
    }

   public void deleteFirst()
   {
       if(head==null)
       {
           System.out.println("There is no element delete");
       }
       else if(head==tail)
       {
           head=null;
           tail=null;
       }
       assert head != null;
       head=head.next;
       head.prev=null;


   }
    public void deleteMid(int pos)
    {
        Node var=head;
        for(int i=1;i<pos-1;i++)
        {
            var=var.next;
        }
        var.next=var.next.next;
    }
    public void deleteLast()
    {
        tail.prev.next=null;
    }

    public void display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.print(node.data+"<->");
            node=node.next;
        }
        System.out.print("End");
    }

}
