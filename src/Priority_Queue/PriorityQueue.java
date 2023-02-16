package Priority_Queue;

public class PriorityQueue {
}

//  Priority_Queue : It ks a complete binary tree. In complete binary tree every root has two children first left then only right child.

//  y>x<z min heap --> value of x is less and priority of x is more.
//  y<x>z max heap --> value of x and priority of x is more.

// example of complete binary tree :-
//                    15(0)
//                  /       \
//               (1)18      20(2)     (pi= parent index)
//                /  \       /  \
//           (3)19  27(4) (5)23  21(6)    (ci=child index)
//             /  \
//        (7)36    120(8)
//Why Heap:
//                      Sorted Array     Unsorted Array      Heap
// Add element           O(n)               O(1)            log(n)
// remove min element    O(n)               O(n)            log(n)
// get min element       O(1)               O(n)             O(1)

// left child index (li) = 2*pi+1
// right child index (ri) = 2*pi+2
// if child index(any left or right for both) is given then     pi =(ci-1)/2


