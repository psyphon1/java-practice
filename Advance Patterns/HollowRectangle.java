package adv_patterns;

public class HollowRectangle {
    public static void hollow(int total_rows, int tot_col) {
        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= tot_col; j++) {
                if (i == 1 || i == total_rows || j == 1 || j == tot_col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
