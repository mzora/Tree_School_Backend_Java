import java.util.Scanner;

import static java.lang.Math.*;

public class Esercizi {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        countOccurrences(a.charAt(0), b);
        */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
        */
        /*
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(isPrime(number));
        number = 999;
        System.out.println(isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
        */
        /*
        System.out.println(factorial(1));//è 1
        System.out.println(factorial(2));
        System.out.println(factorial(5));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);

     */
        /*
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));
        */
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }
    static void countOccurrences(char a, String b) {
        int count = 0;
        for(int i=0;i< b.length(); i++){
            if(b.charAt(i)== a){
                count++;
            }
        }
        System.out.println(count);
    }

    static void stringReverse(String s) {
        char[] s1 = s.toCharArray();
        String newS = "";
        for(int i= s1.length-1;i>=0; i--){
            newS+=s1[i];
        }
        System.out.println(newS);
    }

    private static boolean isPrime(int number) {
        if (number < 1 ) return false;
        if (number == 2 || number == 1) return true;
        if (number % 2 == 0) return false;

        double boundary = Math.floor(Math.sqrt(number));

        for (int i = 3; i <= boundary; i+=2)
            if (number % i == 0)
                return false;
        return true;
    }

    private static long factorial(int n) {
        if(n == 0) return 1;
        long res = 1;
        long temp = 1;

        for(int i = n; i>=1; i--){
            res *= temp;
            temp++;
        }
        return res;
    }

    private static double harmonicSum(int n) {
        if(n==0) return 0;
        //if(n==1) return 1;

        double temp = 0;
        for(double i = n; i>=1 ; i--){
            temp += (1/i);
        }
        return temp;
    }

    private static boolean isPalindrome(String s) {
        char[] s1 = s.toCharArray();
        String newS = "";

        for(int i= s1.length-1;i>=0; i--){
            newS+=s1[i];
        }

        if(s.equals(newS)){
            return true;
        }
        return false;
    }
}