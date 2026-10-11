public class HashTable {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node[] table;
    private int capacity = 20011;

    public HashTable() {
        table = new Node[capacity];
    }

    private int hash(int value) {
        return Math.floorMod(value, capacity);
    }

    public void insert(int value) {
        int index = hash(value);
        Node current = table[index];

        while (current != null) {
            if (current.value == value) {
                return;
            }

            current = current.next;
        }

        Node newNode = new Node(value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public boolean search(int value) {
        int index = hash(value);
        Node current = table[index];

        while (current != null) {
            if (current.value == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void delete(int value) {
        int index = hash(value);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.value == value) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }
}
