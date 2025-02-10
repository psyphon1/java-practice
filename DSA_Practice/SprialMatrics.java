public class SprialMatrics {
    public static void spiral(int num[][]){
        int sr=0;
        int sc=0;
        int er=num.length-1;
        int ec=num[0].length-1;

        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.print(num[sr][j]+" ");
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(num[i][ec]+" ");
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(num[er][j]+" ");
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(num[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int num[][] = { {1,2,3,5},
                        {4,5,6,8},
                        {7,8,9,0}};

        spiral(num);
    }
}
