package CLL;

import java.sql.SQLOutput;

public class Circular {
    private Node head;
    private Node tail;
    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        newNode.next=head;

    }
    public void deleteFirst()
    {
       head=head.next;
       tail.next=head;
    }
    public void deleteMid(int val)
    {
        Node b=head;
        while(b.next.data!=val)
        {
            b=b.next;
        }
        b.next=b.next.next;
    }
    public void deleteLast()
    {
        Node emp=head;
        while(emp.next!=tail)
        {
            emp=emp.next;
        }
        emp.next=head;
    }

    public void display()
    {
        Node x=head;
        do {
            System.out.print(x.data+"->");
            x=x.next;
        }
        while(x!=head);
        System.out.print(head.data);
    }



}
