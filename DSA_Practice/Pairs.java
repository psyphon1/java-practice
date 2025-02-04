public class Pairs {
    public static void pair(int num[]){
        for(int i =0;i<num.length;i++){
            int curr = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("( "+curr+" "+num[j]+" )");
            }
            System.err.println();
        }
    }
    public static void main(String args[]){
        int num[] = {2,5,9,7,6,4};
        pair(num);
    }
}
/*
OUTPUT: 

( 2 5 )( 2 9 )( 2 7 )( 2 6 )( 2 4 )
( 5 9 )( 5 7 )( 5 6 )( 5 4 )
( 9 7 )( 9 6 )( 9 4 )
( 7 6 )( 7 4 )
( 6 4 )

 */
