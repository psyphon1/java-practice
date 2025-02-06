public class Trapping_Water{

    public static void waterTrap(int bars[]){
        //lmb
        int lmb[] = new int[bars.length];
        lmb [0] = bars[0];
        for(int i = 1;i<bars.length;i++){
            lmb[i] = Math.max(bars[i],lmb[i-1]);
        }
        // for(int i=0;i<lmb.length;i++){
        //     System.out.print(lmb[i]+" ");
        // }
        
        //rmb
        int rmb[] = new int[bars.length];
        rmb[bars.length-1] = bars[bars.length-1];
        for(int j = bars.length-2;j>=0;j--){
            rmb[j] = Math.max(bars[j],rmb[j+1]);
        }
        // for(int i = 0;i<bars.length;i++){
        //     System.out.print(rmb[i]+ " ");
        // }
        //loop
        int tot_wt = 0;
        for(int i=0;i<bars.length;i++){
            int Water_Trapped = (Math.min(lmb[i],rmb[i])-bars[i]);
            System.out.print(Water_Trapped+" ");
            tot_wt += Water_Trapped;
        }
        
        System.out.println("\nThe Total Water Trapped is "+tot_wt);

        

    }
    public static void main(String args[]){
        int bars[] = {4,2,0,6,3,2,5};
        waterTrap(bars);
    }
}

/*
OUTPUT: 
0 2 4 0 2 3 0 
The Total Water Trapped is 11
 */
