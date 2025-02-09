public class Bubblesort {

    public static void fun_bubblesort(int num[]) {
        long start_time = System.nanoTime();

        for (int turn = 0; turn < num.length; turn++) {
            boolean swapped = false;
            for (int i = 0; i < num.length - 1 - turn; i++) {
                // Swap
                if (num[i] > num[i + 1]) {
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        long end_time = System.nanoTime();
        long time_taken_micro = (end_time - start_time) / 1_000;  // Microseconds
        long time_taken_ms = (end_time - start_time) / 1_000_000; // Milliseconds

        
        System.out.println("Sorted Array: ");
        for (int j : num) {
            System.out.print(j + " ");
        }
        System.out.println();
        
        System.out.println("\nTime Taken to Sort: " + time_taken_micro + " micro sec");
        System.out.println("Time Taken to Sort: " + time_taken_ms + " ms");
    }

    public static void main(String args[]) {
        int num[] = {8, 5, 7, 6, 2, 0, 3, 1, 9, 45, 78, 56, 98, 21, 32, 78, 9, 56, 89, 87};

        fun_bubblesort(num);
    }
}

/*
OUTPUT:
Sorted Array: 
0 1 2 3 5 6 7 8 9 9 21 32 45 56 56 78 78 87 89 98 

Time Taken to Sort: 8 micro sec
Time Taken to Sort: 0 ms

 */
