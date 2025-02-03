
public class Binary {

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            //condtion when key == num[i]
            int mid = (start + end) / 2;

            if (key == num[mid]) {
                return mid;
            }
            if (key < num[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    return -1;
    }
    public static void main(String args []){
        int num[] = {1,2,3,4,5};
        int key = 5;

        int result = binarySearch(num, key);
        if(num!=null && num.length!=0){
    
            if (result!=-1){
                System.out.println("The Key is found at "+result);
            }
            else{
                System.out.println("Key Not found!");
            }
        }
        else{
            System.out.println("Array is Empty!");
        }    
        
    }
}
