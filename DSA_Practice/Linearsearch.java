import java.util.Scanner;
public class Linearsearch{
    public static void Linear_Search(){
        Scanner sc = new Scanner(System.in);

        //taking array size
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();
        System.out.println();
        //creating array of size n
        int num[] = new int[n];

        //taking input of elements to put in array
        for (int i = 0; i < n ; i++) {
            System.out.print("Enter Element:");
            num[i] = sc.nextInt();     
            }
            System.out.println();

        //taking number to find in array
        System.out.print("Enter Num to find:");
        int find = sc.nextInt();
        System.out.println();

        boolean b = false;
        //Linear search
        for( int i = 0;i<num.length;i++){
            if(num[i] == find){
                System.out.println(find+ " is found at index "+ i);
                b =true; 
                break; //exit if found
            }

        }

        if(!b) {
            System.out.println(find+ " is not found!");
        }
        sc.close();
    }

public static void main(String[] args) {
    Linear_Search();
    }
}

/*
Enter Size of Array:4

Enter Element:1
Enter Element:21
Enter Element:9
Enter Element:5

Enter Num to find:9

9 is found at index 2

 */
