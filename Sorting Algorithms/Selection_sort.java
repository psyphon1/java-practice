public class Selection_sort {
    public static void logic(int num[]) {
        long starttime = System.nanoTime();

        for (int i = 0; i < num.length - 1; i++) {
            int curr_pos = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[curr_pos] > num[j]) {
                    curr_pos = j;
                }
            }
            if (curr_pos != i) {
                //swap
                int temp = num[i];
                num[i] = num[curr_pos];
                num[curr_pos] = temp;
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        long endtime = System.nanoTime();
        long exetime = endtime - starttime;
        
        System.out.println();
        System.out.println("Execution time: " + (endtime / 1_000) + " microsec");
        System.out.println("Execution time: " + (exetime / 1_000_000) + " ms");
    }

    public static void main(String args[]) {
        int num[] = {8, 5, 7, 6, 2, 0, 3, 1, 9, 45, 78, 56, 98, 21, 32, 78, 9, 56, 89, 87};
        logic(num);
    }
}

/*
OUTPUT:
0 1 2 3 5 6 7 8 9 9 21 32 45 56 56 78 78 87 89 98 
Execution time: 5530807741 microsec
Execution time: 17 ms
 */
