package ArrayProblems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        if (accounts.length == 0) {
            return -1;
        }
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int customerWealth = 0;
            for (int i : account) {
                customerWealth += i;
                if (customerWealth > maxWealth) {
                    maxWealth = customerWealth;
                }
            }
        }
        return maxWealth;
    }
}
