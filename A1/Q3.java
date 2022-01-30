import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
public class Q3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Queue<Integer> list_1 = new LinkedList<>();
    Queue<Integer> list_2 = new LinkedList<>();

    int length_1 = in.nextInt();
    // for 0 : length_1 { add in.nextInt() to list_1 }
    
    int length_2 = in.nextInt();
    // for 0 : lenght_2 { add in.nextInt() to list_2 }

    /* By comparing the top elements of each queue, determine
     * which one to put into the final queue
     */
    
    // Prepare the Queue to store the sorted elements
    // Queue list_3 = new Linkedlist
    // while (list_1 and list_2 not empty) {
    //   if (peek(list_1) == peek(list_2)) {
    //     add remove(list_1) to list_3
    //     remove(list_2)
    //   } else if (peek(list_1) < peek(list_2)) {
    //     add remove(list_1) to list_3
    //   } else {
    //     add remove(list_2) to list_3
    //   }
    // }

    // Once this is reached if list_1 is not exhausted we add all elements to list_3
		// list2
		// must be empty if list1 still has elements
    // while (list_1 not empty) {
    //   add remove(list_1) to list_3
    // }

    // Once this is reached if list_2 is not exhausted we add all elements to list_3
		// list_1
		// must be empty if list2 still has elements
    // while (list_2 not empty) {
    //   add remove(list_2) to list_3
    // }

    /* Until now, we have added all elements from list 1 and 2 
     * to list 3. And list 3 is sorted. Next, we need to print
     * the elements in list 3.
     */
    // for 0 : list_3.size { print element }

    // NOTE: DO NOT USE THE FOLLOWING CODE!
    for (int i = 0; i < list_3.size(); i++) {
      System.out.print(list_3.remove() + " ");
    }
    // Because as we remove elements from list, the value of 
    // list_3.size() is also decreasing, so the total number of
    // the iterations would be less than the actual size of list 3
  }
}
