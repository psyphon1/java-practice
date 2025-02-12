
public class StaircaseSearch {

    public static void search(int num[][], int key) {
        int row = 0;
        int col = num[0].length - 1;
        while (row < num.length && col >= 0) {
            if (num[row][col] == key) {
                System.out.println("Key Found at (" + row + "," + col + ")");
                break;
            } else if (key < num[row][col]) {
                col--;
            } else if (key > num[row][col]) {
                row++;
            } else {
                System.out.println("Key not found!");
            }
        }
    }

    public static void main(String args[]) {
        int num[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},};
        search(num,29);
    }
}


/*
OUTPUT:
Key Found at (2,1)

 */
