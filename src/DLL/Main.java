package DLL;

public class Main {
    public static void main(String[] args) {
        Doubly list1=new Doubly();
        list1.insertEnd(5);
        list1.insertEnd(10);
        list1.insertEnd(15);
        list1.insertEnd(20);
        list1.display();
        list1.deleteFirst();
        System.out.println();
        list1.display();

    }


}
