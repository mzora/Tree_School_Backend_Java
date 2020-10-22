package prima_es;
import java.util.Scanner;

public class OperazioniAritmetiche {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        computeValues(a, b);
        */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        checkEvenOdd(number);
        */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        reverseString(a);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        System.out.print("Enter string:");
        String b=sc.nextLine();
        System.out.print("Enter string:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
        */
        /*
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals(""+compareStrings(a, b, c)) +" "+compareStrings(a, b, c));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals(""+compareStrings(a, b, c))+" "+compareStrings(a, b, c));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals(""+compareStrings(a, b, c))+" "+compareStrings(a, b, c));
        */
    }

    private static void computeValues(int a, int b) {
            System.out.println("somma: "+ (a+b));
            System.out.println("sottrazione: "+ (a-b));
            System.out.println("molt: "+ (a*b));
            System.out.println("div: "+ (a/b));
    }

    private static void checkEvenOdd(int number) {
        if(number%2 == 0){
            System.out.println("pari");
        }else{
            System.out.println("dispari");
        }
    }

    private static void reverseString(String s) {
        String[] split = s.split(" ");
        System.out.println(split[1] + " " + split[0]);
    }

    private static void replaceIntruder(String a, String b , String c) {
        String[] split = c.split(" ");
        String res = split[1].replace(a,b);
        System.out.println(split[0]+" "+ res+" "+ split[2]);
    }

    private static int compareStrings(String a, String b, String c) {
        int res = 0;
        if(a.equalsIgnoreCase(b)){
            res = 2;
            if(b.equalsIgnoreCase(c)) {
                res++;
                return res;
            }
        }
        if(a.equalsIgnoreCase(c)){
            res++;
        }
        return res;
    }
}