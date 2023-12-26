public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = { -5, 4, 6, -3, 4, 1 };

        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest possible value
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
