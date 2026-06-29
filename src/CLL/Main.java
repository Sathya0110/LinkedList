package CLL;

public class Main {
    public static void main(String[] args) {
        Circular list=new Circular();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.deleteLast();
        System.out.println();
        list.display();

    }
}
