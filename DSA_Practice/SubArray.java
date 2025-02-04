public class SubArray{
    public static void sub(int num[]){
        int ts = 0;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sum of Array is " +ts);
    }

    public static void main(String args[]){
        int num[]={2,5,1,7,3};
        sub(num);
    }
}

/*
OUTPUT:

2 
2 5 
2 5 1 
2 5 1 7 
2 5 1 7 3 

5 
5 1 
5 1 7 
5 1 7 3 

1 
1 7 
1 7 3 

7 
7 3 

3 

Sum of Array is 35

 */
