import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.notification.RunListener;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {



    @Test
    void getTest() throws ListException {

        Node node = new Node();
        node.Add(15);
        node.Add(20);
        Throwable thrown = assertThrows(ListException.class, () -> {
            node.get(4, 2);
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void getTest1() throws ListException {
        Node node = new Node();
        node.Add(15);
        node.Add(20);

        Object n = node.get(1,2);
        assertEquals(20, n);


    }

    @Test
    void getTest2() throws ListException{
        Node node = new Node();
        Throwable thrown = assertThrows(ListException.class, () -> {
            node.get(0, 0);
        });
        assertNotNull(thrown.getMessage());
    }


    @Test
    void addTest() {
        Node node = new Node();
        node.Add(15);
        node.Add(20);

        assertEquals(2, node.size());
    }

    @Test
    void removeTest1() throws ListException {
        Node node = new Node();
        node.Add(15);
        node.Add(20);
        node.remove(20);
        node.remove(15);
        assertEquals(0, node.size());
    }

    @Test
    void removeTest2() throws ListException {
        Node node = new Node();
        Throwable thrown = assertThrows(ListException.class, () -> {
            node.remove(15);
        });
        assertNotNull(thrown.getMessage());


    }

    @Test
    void sizeTest() {
        Node node = new Node();
        node.Add(15);
        node.Add(20);
        assertEquals(2, node.size());

    }
}