import java.util.*;

class Palindrome {
    private Deque<Character> stack;
    private Deque<Character> queue;

    public Palindrome() {
        stack = new ArrayDeque<>();
        queue = new ArrayDeque<>();
    }

    public void pushCharacter(char ch) {
        stack.addFirst(ch);
    }

    public char popCharacter() {
        return stack.removeFirst();
    }

    public void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }

    public char dequeueCharacter() {
        return queue.poll();
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the string s.
        String s = sc.nextLine();

        // Create the Palindrome class object p.
        Palindrome p = new Palindrome();
        // Converting string to a character array.
        char arr[] = s.toCharArray();
        // Push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }

        // Enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }

        boolean f = true;

        // Pop the top character from stack.
        // Dequeue the first character from queue.
        // Compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;
                break;
            }
        }

        // Finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }

}
