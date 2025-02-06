
public class MaxSum {
//bruteforce approach
    public static void sum(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            // int start = i;
            for (int j = i; j < num.length; j++) {
                int currsum = 0;
                // int end = j;
                for (int k = i; k <= j; k++) {
                    currsum += num[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The Max Sum of Array is " + maxsum);
    }

    public static void main(String args[]) {
        int num[] = {-2, -5, -4, -3, -7, -8};
        sum(num);
    }
}

/*
OUTPUT : 
The Max Sum of Array is -2
 */
