# bonus-task
BST and Hash Table Performance Comparison
1)Introduction: The purpose of this project is to implement a Binary Search Tree (BST) and a Hash Table in Java and compare their performance. The experiment measures insertion, searching, and deletion with 100, 1,000, and 10,000 elements.
2)Implementation 
Binary Search Tree (BST):The BST stores values in nodes. Each node has a left child and a right child. Smaller values are stored on the left, and larger values are stored on the right. The implementation supports insertion, searching, and deletion. Duplicate values are ignored.
Hash Table:The Hash Table uses an array and linked lists to handle collisions. A hash function calculates the bucket index for each value. When multiple values map to the same bucket, they are stored in a linked list. The implementation supports insertion, searching, and deletion. Duplicate values are ignored.
3)Time Complexity Analysis: The time complexity describes how the execution time grows when the number of elements increases. Here, n represents the number of elements.
Binary Search Tree (BST):
- Insertion: Best case O(1), worst case O(n).
- Searching: Best case O(1), worst case O(n).
- Deletion: Best case O(1), worst case O(n).
- Average case: O(log n) for a reasonably balanced tree.
Hash Table:
- Insertion: Best case O(1), worst case O(n).
- Searching: Best case O(1), worst case O(n).
- Deletion: Best case O(1), worst case O(n).
- Average case: O(1), assuming a good hash function and a reasonable distribution of values.
4)Experimental setup: The program was written in Java and tested using IntelliJ IDEA. System.nanoTime() was used to measure execution time in nanoseconds.
Three dataset size test:
- 100 elements
- 1,000 elements
- 10,000 elements
The experiment measured three operations:
- Insertion: adding all values.
- Searching: searching for every inserted value.
- Deletion: deleting all inserted values.
The results below may differ on different setups, as this is a one run time results.
5)Experimental Results(all data from results.csv)
Dataset size: 100 elements
- BST insertion: 2,725,400 ns
- Hash Table insertion: 248,100 ns
- BST searching: 63,000 ns
- Hash Table searching: 46,200 ns
- BST deletion: 144,800 ns
- Hash Table deletion: 54,600 ns
Dataset size: 1,000 elements
- BST insertion: 2,373,900 ns
- Hash Table insertion: 407,300 ns
- BST searching: 1,691,300 ns
- Hash Table searching: 201,700 ns
- BST deletion: 483,200 ns
- Hash Table deletion: 237,900 ns
Dataset size: 10,000 elements
- BST insertion: 21,353,600 ns
- Hash Table insertion: 17,978,700 ns
- BST searching: 6,618,700 ns
- Hash Table searching: 4,401,400 ns
- BST deletion: 6,731,300 ns
- Hash Table deletion: 11,477,800 ns
6)Discussion
The Hash Table was faster for insertion and searching in all three experiments. It was also faster for deletion with 100 and 1,000 elements. However, for 10,000 elements, the BST had a lower measured deletion time.
The results show that practical performance depends on more than theoretical complexity. A BST's performance depends on its shape and balance. A Hash Table's performance depends on its hash function, bucket distribution, and collisions. JVM warm-up and measurement variability may also affect the results.
The experiment was performed only once for each operation and dataset size. Therefore, the results should be treated as initial measurements rather than definitive proof that one structure is always faster.
7)Conclusion
The Hash Table performed better in most of the measured operations. It is useful when fast searching is important and values are distributed well across buckets.
A BST can be useful when maintaining values in sorted order is important. However, the implemented BST does not automatically balance itself, so its performance can become worse when the tree is unbalanced.
In conclusion, both data structures have advantages and disadvantages. The best choice depends on the application's requirements, the input data, and the operations that are performed most often.
8)Project Files
src/BST.java: Binary Search Tree implementation.
src/HashTable.java: Hash Table implementation.
src/Main.java: Program that runs the experiments and measures execution time.
results.csv: Experimental results.
README.md: Project description.