public class demo1 {
    public static void main(String []args){
        for(int a=1;a<10;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println();

        for(int e=0;e<10;e++){
            for(int f=10;f>=e+1;f--){
                System.out.print(" ");
            }
            for(int g = 1;g<=e+1;g++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int c=1;c<=10;c++){
            for(int d=10;d>=c+1;d--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=-1;i<10;i++){
            for(int j=10;j>=i+1;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<=i+1;k++){
                System.out.print("*");
            }
            for(int l = 0;l<=i;l++){
                System.out.print("*");

            }
        System.out.println();
        }
        // for(int f = 1;f<=25;f++){
        //     System.out.println("          **");
        // }
    }
}
