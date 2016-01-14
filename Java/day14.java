import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] nums) {
        int n = nums.length;
        elements = new int[n];
        for(int i = 0; i < n; ++i) {
            elements[i] = nums[i];
        }
    }

    public void computeDifference() {
        int min = 100;
        int max = 0;
        for(int i = 0; i < elements.length; ++i) {
            int tmp = elements[i];
            if(min > tmp) min = tmp;
            if(max < tmp) max = tmp;
        }

        maximumDifference = max - min;
    }
}

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[N];

    	for (int i = 0; i < N; i++) {
    		a[i] = sc.nextInt();
    	}

        Difference D = new Difference(a);
        D.computeDifference();
        System.out.print(D.maximumDifference);
   }

}
