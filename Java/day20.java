import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] words = str.split("[!,'@+\\\\?\\s\\.\\[\\]\\_]+");
        // words[0] might be empty.
        int offset = 0;
        if(words.length != 0 && words[0].equals("")) offset = 1;
        System.out.println(words.length - offset);
        for(int i = offset; i < words.length; ++i) {
            System.out.println(words[i]);
        }

        // StringTokenizer st = new StringTokenizer(str, " [!,?.\\_'@]+");
        // System.out.println(st.countTokens());
        // while (st.hasMoreTokens()) {
        //     System.out.println(st.nextToken());
        // }
    }

}
