public class smallest_num {
    public static void findSmallest() {
        int num[] = {2, 6, 3, 9, 54, 1}; 
        if (num.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) { 
                smallest = num[i];
            }
        }
        System.out.println("Smallest is " + smallest);
    }

    public static void main(String args[]) {
        findSmallest();
    }
}
