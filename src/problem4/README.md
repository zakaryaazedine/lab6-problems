# Problem 4

The test used 100,000 elements and 10,000 operations.

For random insertions and deletions, ArrayList took 115.3 ms and LinkedList took 4743.6 ms. ArrayList was faster. It has to shift elements in its array, but LinkedList has to go through nodes to find each index before changing the links. Both operations take O(n) in this test.

For insertions and deletions at the beginning and end, ArrayList took 489.3 ms and LinkedList took 7.9 ms. LinkedList was faster because it changes the links directly in O(1). ArrayList has to shift elements when adding or removing at the beginning, which takes O(n). Adding at the end takes O(1) on average, and removing the last element takes O(1).

For random access, ArrayList took 6.7 ms and LinkedList took 3802.7 ms. ArrayList was faster because it gets an element directly from the array in O(1). LinkedList has to go through nodes to reach the index, which takes O(n).

The times can change between runs. Both lists use the same random seed so they use the same indices. The sum was 500987739 for both lists.
