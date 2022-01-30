import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

public class Q2 {
  public static void main(String[] args) {
    /* 1. Add each character to the Deque
     * 2. Remove character from both ends and compare
     * 3. Remove length/2 times
     */

    // Create a Deque to store elements
    Deque<String> str = new ArrayDeque<>();
    Scanner in = new Scanner(System.in);

    // Get the character from input
    String character = in.nextLine();
    // if (character = "That's All Folks") {print "Yes"}
    // else {
    //   while (character.length = 1) {
    //     add to str
    //     character = in.nextLine()
    //   }
    //   int length = size of str
    //   boolean isPalindrome = true
    //   for 0 : length/2 {
    //     if (!str.removeFirst().equals(str.removeLast())) {
    //       isPalindrome = false;
    //     }
    //   }
    // if (isPalindrome) {
     //   print("Yes")
     // } else {
     //   print("No")
     // }
    // }
  }
}
