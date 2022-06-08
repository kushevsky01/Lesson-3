public class Node {
    private LinkList head;

    public Node() {

        head = null;
    }

    public void Add(Object data) {
        LinkList tmp = new LinkList(data);
        LinkList tmp2 = head;
        if (tmp2 == null) {
            head = tmp;
        } else {
            while (tmp2.next != null) {
                tmp2 = tmp2.next;
            }
            tmp2.next = tmp;
        }
    }


    public Object get(int number, int size) throws ListException {


        LinkList tmp = head;
        if (tmp == null) {
            throw new ListException("List is empty");
        } else {
            int i = 0;
            while (i != number && tmp.next != null) {
                tmp = tmp.next;
                i++;
            }
        }

        if (number > size || number < 0) {
            throw new ListException("Непдоходящий диапозон");
        } else {
            return tmp.data;
        }
    }


    public  void remove(Object data) throws ListException {

        LinkList tmp = head;
        if (tmp != null) {
            if (tmp.data == data) {
                head = tmp.next;


            } else {
                while (tmp.next != null) {
                    LinkList nextEl = tmp.next;
                    if (nextEl.data == data) {
                        tmp.next = tmp.next.next;
                        return;

                    }
                    tmp = tmp.next;
                }
            }
        } else {
            throw new ListException("list is empty");
        }

    }


    public void print() {
        LinkList tmp = head;
        if (tmp == null) {
            System.out.println("List is empty");
        } else {

            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }

    }

    public int size() {
        int count = 0;
        LinkList sz = head;
        while (sz != null) {
            count++;
            sz = sz.next;
        }
        return count;
    }
}
