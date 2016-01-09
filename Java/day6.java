import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i) {
            System.out.print(new String(new char[n - i - 1]).replace("\0", " "));
            System.out.println(new String(new char[i + 1]).replace("\0", "#"));
        }
    }

}
