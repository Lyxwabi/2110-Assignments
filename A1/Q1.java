import java.util.Scanner;
import java.util.Stack;

public class Q1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Stack<String> str = new Stack<>();

    /* 1. Store the letters in the Stack
     * 2. Split the Stack in half
     * 3. Push half of the elements into another Stack
     * 4. If the length of the Stack is odd,
     *    then pop the top element in the original Stack
     *    (which is the middle one)
     *    i.e. a b c b a -> a b c + a b
     * 5. Pop the elements of the two Stacks, if there exists
     *    one element that does not match, then this string is
     *    not a palindrome
     */

     int length = in.nextInt();

     // for 0 : length {
     //   String nextLetter = in.next()
     //   add to str
     // }

     // Create another Stack
     // Stack<String> temp = new Stack
     // for 0 : length/2 {
     //   add str.pop() to temp
     // }

     // if (length is odd) {str.pop()}

     /* Create a variable to indicate whether the string is palindrome */
     // boolean isPalindrome = true;
     // while (str and temp are not empty) {
     //   if (str.pop not equals temp.pop) {
     //     isPalindrome = false
     //     break the loop
     //   }
     // }

     // if (isPalindrome) {
     //   print("Yes")
     // } else {
     //   print("No")
     // }
  }
}