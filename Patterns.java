public class Patterns {
    static void pattern1(int n ){
            for(int i =0 ; i<n ;i++){
                for(int j=0;j<n ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    static void pattern2(int n ){
        for(int i=1 ; i<=n ;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void patter4(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patter5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n - i +1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=0;i<n;i++){

            //space 
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int k=0;k<2*i+1 ;k++){
                System.out.print("*");
            }
            //space
            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            //space 
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int k =0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            //space
            for(int l =0;l<i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i =1;i<=(2*n-1);i++){
            int start = i ;
            if(i > n) {
                start = 2*n -i;
            }
            for(int j =1;j<=start;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        int start = 1;
        for(int i=0;i<n;i++){
            if(i %2 == 0) start =1;
            else start = 0;
            for(int j =0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            int space = 2*(n-i);
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //space
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
           
        }
    }
    static void pattern11(int n){
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int i=0;i<n;i++){
            for(char ch='A' ; ch<='A'+i ;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void pattern14(int n ){
        for(int i=0;i<n;i++){
            char ch =(char) ('A'+ i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int i=0;i<n;i++){
            // space 
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // alphabets
            char ch ='A';
            int breakPoint = (2*i+1)/2;
            for(int j =1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j <=breakPoint) ch++;
                else ch--;
            }

            // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern16(int n ){
        int inistialSpace =0;
        for(int i=0;i<n;i++){
            // starts
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            // space
            for(int j=0;j<inistialSpace;j++){
                System.out.print(" ");
            }
            // starts
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            inistialSpace+= 2;
        }
        int inistialSpace1 =8;
        for(int i=1;i<=n;i++){
            // starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            for(int j=0;j<inistialSpace1;j++){
                System.out.print(" ");
            }
            // starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            inistialSpace1-= 2;
        }
    }
    static void pattern17(int n ){
        int spaces = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int starts=i;
            if(i>n) starts = 2*n-i;
            // starts
            for(int j=1;j<=starts;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // starts
            for(int j=1;j<=starts;j++){
                System.out.print("*");
            }
            if(i < n) spaces-= 2;
            else spaces+= 2;
            System.out.println();

        }
    }
    static void pattern18(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i == 1 || j == 1 || i == n|| j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 5 ; 
        pattern18(n);
        }
}
