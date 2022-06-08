import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws ListExceptions {
        Node node = new Node();

        node.Add(10);
        node.Add(20);
        node.Add(30);

        System.out.println("-------------------------");
        System.out.println( node.get(1, node.size()));
        node.print();
        System.out.println("-------------------------");
        node.Add(55);
        node.print();
        System.out.println("-------------------------");
        node.remove(20);
        node.print();

    }

}
