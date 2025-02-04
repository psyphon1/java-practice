public class largest_num {
    public static void findLargest() {
        int num[] = {2, 6, 3, 9, 54, 1};

        if (num.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("Largest is " + largest);
    }

    public static void main(String args[]) {
        findLargest();
    }
}

/*
OUTPUT:

Largest is 54

 */
