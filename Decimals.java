public class Decimals {
    static void reverseOFANumber(int n){
        int lastdigit , reversedNumber =0;
        while(n > 0){
            lastdigit = n % 10;
            n = n /10;
            reversedNumber = (reversedNumber * 10) + lastdigit; 
        }
        System.out.println(reversedNumber);
    }
    static void palindrome(int n){
        int dump =n;
        int lastdigit , reversedNumber1=0;
        while(n > 0){
            lastdigit = n % 10;
            n = n/10;
            reversedNumber1 = (reversedNumber1*10)+lastdigit;
        }
        if(dump == reversedNumber1){
            System.out.println("Plaindrome");
        }else{
            System.out.println("Not Plaindrome");
        }
    }
    static void armstrongNumber(int n){  // only for the 3 digits
        int sum = 0 ;
        int dump = n;
        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            n /= 10;
        }
        if(dump == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }

    static int armstrongNumberForNDigits(int n){ // for any number of digits
        int sum =0;
        int orginalNumber = n ;
        int numDigits = String.valueOf(n).length();
        while(n > 0){
            int lastdigit = n % 10;
            sum += Math.pow(lastdigit, numDigits);
            n /= 10;
        }
        // if(orginalNumber == sum){
        //     System.out.println("ArmStrong Number"); 
        // }else{
        //     System.out.println("Not an ArnStrong Number");
        // }
        int res = sum == orginalNumber ? 1 : 0;  // Using Ternary Operator (return always a int value )
        return res;                               // 1 - True(Armstrong Number) 0 - False(Not ArmstrongNumber)
    }
    static void printAllDivisors(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                System.out.print(i+ " ");
                if((n/i)!= i){
                    System.out.print((n/i)+" ");
                }
            }
        }  
    }
    public static void main(String[] args) {
        int number = 36;
        printAllDivisors(number);
    }
}
