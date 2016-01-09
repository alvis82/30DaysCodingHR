public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int pow2 = 1;
            int sum = a + b * pow2;
            System.out.print(sum);
            for(int j = 1; j < n; ++j) {
                pow2 *= 2;
                sum += b * pow2;
                System.out.print(" ");
                System.out.print(sum);
            }
            System.out.println();
        }
    }

}
