import java.util.*;

class Calculator {
    public int power(int n, int p) throws Exception {
        if(n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");

        if(n == 1 || p == 0) return 1;

        Stack<Integer> stack = new Stack<>();
        while(p > 1) {
            stack.push(p % 2);
            p >>= 1;
        }

        int pow = n;
        while(!stack.empty()) {
            pow *= pow;
            if(stack.pop() == 1) pow *= n;
        }

        return pow;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
