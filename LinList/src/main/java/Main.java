import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws ListException {
        Node node = new Node();

        node.Add(10);
        node.Add(20);
        node.Add(30);

        node.get(1,3);

        node.remove(20);
        node.remove(30);
        node.remove(10);
        node.remove(1);

        node.print();


    }

}
