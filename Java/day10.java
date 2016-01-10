import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i) {
            int num = sc.nextInt();
            LinkedList<Integer> bin = new LinkedList<>();
            while(num > 0) {
                bin.addFirst(num % 2);
                num >>= 1;
            }
            for(int b: bin) {
                System.out.print(b);
            }
            System.out.println();
        }
    }

}
