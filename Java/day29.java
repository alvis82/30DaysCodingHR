import java.util.*;

public class Solution {
    public static boolean isFunny(String str) {
        int left = 1;
        int right = str.length() - 2;
        while(left <= right) {
            if(Math.abs(str.charAt(left - 1) - str.charAt(left)) !=
               Math.abs(str.charAt(right + 1) - str.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < testcases; ++i) {
            String str = sc.nextLine();
            if(isFunny(str)) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }
}
