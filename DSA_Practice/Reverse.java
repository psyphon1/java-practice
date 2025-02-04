


public class Reverse {

    public static void rev(int nums[]) {
        //initializing indexes
        int start = 0;
        int end = nums.length - 1;

        //loop
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3,4,5};
        rev(nums);
        if (nums.length!=0) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("Array is empty");
        }
    }
}
