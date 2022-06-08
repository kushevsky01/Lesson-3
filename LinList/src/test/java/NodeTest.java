import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {



    @org.junit.jupiter.api.Test()
    void getTest() throws ListException {

        Node node = new Node();
        node.Add(15);
        node.Add(20);
        Throwable thrown = assertThrows(ListException.class, () -> {
            node.get(4, 2);
        });
        assertNotNull(thrown.getMessage());
    }
    
//    @org.junit.jupiter.api.Test
//    void removeTest() {
//        Node node = new Node();
//        node.Add(15);
//        node.Add(20);
//        node.remove(20);
//
//    }

    @org.junit.jupiter.api.Test
    void addTest() {
        Node node = new Node();
        node.Add(15);
        node.Add(20);

        assertEquals(2, node.size());
    }

    @org.junit.jupiter.api.Test
    void removeTest1() {
        Node node = new Node();
        node.Add(15);
        node.Add(20);
        node.remove(20);
        node.remove(15);
        assertEquals(0, node.size());
    }

    @org.junit.jupiter.api.Test
    void sizeTest() {
        Node node = new Node();
        node.Add(15);
        node.Add(20);
        assertEquals(2, node.size());

    }
}