public class Kadanes{

    public static void sum(int num[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0;i<num.length;i++){
            cs = cs + num[i];
            if(cs<0){
                if(num[i]<ms){
                    cs = num[i];
                }
                else{
                    cs=0;
                }
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("The sum of array is "+ ms);
    }
    public static void main(String args[]){
        int num[] = {-7,-5,-2};
        sum(num);
    }
}

/*
OUTPUT: 
The Max Sum of Array is -2
 */
