import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int minad = Integer.MAX_VALUE;
        for(int i = 1; i < n; ++i) {
            if(minad > nums[i] - nums[i - 1]) {
                minad = nums[i] - nums[i - 1];
            }
        }
        for(int i = 1; i < n; ++i) {
            if(minad == nums[i] - nums[i - 1]) {
                System.out.print(nums[i - 1] + " " + nums[i] + " ");
            }
        }
        System.out.println();
    }

}
