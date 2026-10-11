import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000};
        Random random = new Random(42);

        System.out.println(
                "Structure,Size,Operation,Time_ns"
        );

        for (int size : sizes) {

            int[] values = new int[size];

            for (int i = 0; i < size; i++) {
                values[i] = i * 2 + 1;
            }

            for (int i = size - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);

                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }

            BST bst = new BST();
            HashTable hashTable = new HashTable();

            long start = System.nanoTime();

            for (int value : values) {
                bst.insert(value);
            }

            long end = System.nanoTime();

            System.out.println(
                    "BST," + size + ",Insertion," + (end - start)
            );

            start = System.nanoTime();

            for (int value : values) {
                hashTable.insert(value);
            }

            end = System.nanoTime();

            System.out.println(
                    "HashTable," + size + ",Insertion," + (end - start)
            );

            start = System.nanoTime();

            for (int value : values) {
                bst.search(value);
            }

            end = System.nanoTime();

            System.out.println(
                    "BST," + size + ",Searching," + (end - start)
            );

            start = System.nanoTime();

            for (int value : values) {
                hashTable.search(value);
            }

            end = System.nanoTime();

            System.out.println(
                    "HashTable," + size + ",Searching," + (end - start)
            );

            start = System.nanoTime();

            for (int value : values) {
                bst.delete(value);
            }

            end = System.nanoTime();

            System.out.println(
                    "BST," + size + ",Deletion," + (end - start)
            );

            start = System.nanoTime();

            for (int value : values) {
                hashTable.delete(value);
            }

            end = System.nanoTime();

            System.out.println(
                    "HashTable," + size + ",Deletion," + (end - start)
            );
        }
    }
}
