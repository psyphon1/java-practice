
import java.util.Random;
import java.util.Scanner;

public class TwoD_Arr {
public static int largest(int num[][]){
    int largest = 0;
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num[0].length;j++){
            if(largest<num[i][j]){
                largest=num[i][j];
            }
        }
    }
    return largest;
}

public static int smallest(int num[][]){
    int smallest = Integer.MAX_VALUE;
    for(int i = 0;i<num.length;i++){
        for(int j=0;j<num[0].length;j++){
            if(num[i][j]<smallest){
                smallest = num[i][j];
            }
        }
    }
    return smallest;
}
    public static boolean search(int num[][],int key){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i][j]==key){
                    System.out.println("Key found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int m = 3;
        int n = 3;
        int num[][] = new int[m][n];
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // System.out.println("Enter input for "+i+" "+j);
                num[i][j] = ran.nextInt(10);
            }
        }
        System.out.println();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println(largest(num));
        System.out.println(smallest(num));
    }
}
