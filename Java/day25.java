import java.util.*;

public class Solution {
    public static boolean isPrime(int n) {
        if(n == 1) return false;

        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; ++i) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTestcase = sc.nextInt();
        for(int i = 0; i < numOfTestcase; ++i) {
            int testcase = sc.nextInt();
            if(isPrime(testcase)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
