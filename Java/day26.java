import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        if(returnYear > expectedYear) {
            System.out.println(10000);
        } else if(returnYear == expectedYear &&
                  returnMonth > expectedMonth) {
            System.out.println(500 * (returnMonth - expectedMonth));
        } else if(returnYear == expectedYear &&
                  returnMonth == expectedMonth &&
                  returnDay > expectedDay) {
            System.out.println(15 * (returnDay - expectedDay));
        } else {
            System.out.println(0);
        }
    }
}
