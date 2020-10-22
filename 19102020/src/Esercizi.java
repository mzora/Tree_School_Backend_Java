import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Collections;

public class Esercizi {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num = sc.nextInt();
        String stringa = oreMinutiSecondi(num);
        System.out.println(stringa);
        */
        /*
        int[] myArr = new int[]{1,2,3,4,5};
        String myStr = Arrays.toString(daDispariAPari(myArr));
        System.out.println(myStr);
        */
        /*
        String myStr = Arrays.toString(Tabelline(2,5));
        System.out.println(myStr);
        */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index:");
        int index =sc.nextInt();
        fibonacci(index);
        */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        anagrams(a, b);
         */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
        */
        /*
        int[][] quadra = {
                {1,2,11},
                {4,5,6},
                {7,8,9},
        };
        int sommaQuadra = sommaDiagonale(quadra, false);
        System.out.println(sommaQuadra);
        */

        //Scanner sc= new Scanner(System.in);
        //System.out.print("Enter numbers (comma-separated):");
        //String a =sc.nextLine();
        int[] numeriEstratti = {1,3,4,77,88,13,6,7,90,11,23,34,35,36,33,14,12,52,89,88};
        //int[] numeriEstratti = {15,2,3};
        int[][] tombola = {
                {15,2,3,4,5},
                {6,7,90,9,22},
                {33,12,77,14,15},
        };
        Tombola(numeriEstratti, tombola);
    }

    public static String oreMinutiSecondi(int numero){
        int hours = numero / 3600;
        int minutes = (numero % 3600) / 60;
        int seconds = numero % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static int[] daDispariAPari(int[] arr){
        int[] newArr = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        for(int i=0; i< newArr.length;i++){
            if(newArr[i]%2 != 0){
                newArr[i] = newArr[i]*2;
            }
        }
        return newArr;
    }

    public static int[] Tabelline(int n, int m){
        int[] newArr = new int[m];

        for(int i=0; i<m; i++){
            newArr[i] = n*(i+1);
        }
        return newArr;
    }

    public static void fibonacci(int n){
        //int temp = 0, temp_2 = 0;
        int[] myFib = new int[n];
        myFib[0] = 0;
        myFib[1] = 1;

        for(int i=2; i<n; i++){
            myFib[i] = myFib[i-1]+myFib[i-2];
        }
        System.out.println(myFib[n-1]);
    }

    public static void anagrams(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length()==b.length()) {
            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();

            int cnt = 0;
            int testCnt =0;
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (aArr[i] == bArr[j]) {
                        cnt++;
                        if (cnt < 2) {
                            bArr[j] = '*';
                            testCnt++;
                        }
                    }
                    cnt = 0;
                }
            }

            if(testCnt==a.length()){
                System.out.print("anagrammi");

            }else{
                System.out.print("NON anagrammi");
            }

            System.out.println(testCnt);
            System.out.println(Arrays.toString(bArr));
        }
    }

    static int[] parseNumbers(String s) {
        String[] stringTokens = s.split(",");
        int[] intArr= Stream.of(stringTokens).mapToInt(strToken->Integer.parseInt(strToken)).toArray();
        return intArr;
    }

    static void computeMinAndMax(int[] values) {
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        for(int i= values.length-1; i>=0; i--){
            System.out.println(values[i]);
        }
    }

    public static int sommaDiagonale(int[][] quad, boolean verso){
        int n = quad[0].length;
        int sum = 0;

        if(!verso) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(i==j)
                    {
                        sum = sum+quad[i][j];
                    }
                }
            }
            return sum;
        }

        int m = n;
        for(int i=0; i<n; i++) {
            m--;
            for(int j=0; j<n; j++)
            {
                if(j==m)
                {
                    sum = sum+quad[i][j];
                }
            }
        }
        return sum;
    }

    public static void Tombola(int[] estrazioni, int[][] scheda)
    {
        int ambi=0;
        int terne=0;
        int quaterne =0;
        int cinquine=0;
        int counter = 0;
        int righe = 3;
        int colonne=5;

        counter=0;
        for(int j=0; j < righe; j++){
            counter=0;
            for(int k=0; k < colonne; k++){
                for(int i=0; i < estrazioni.length; i++){
                    if(estrazioni[i]==scheda[j][k]){
                        counter++;
                }
                }
            }
            if(counter ==2){
                ambi++;
            }else if(counter == 3){
                terne++;
            }else if(counter==4){
                quaterne++;
            }else if(counter==5){
                cinquine++;
            }
        }
        if(cinquine==3){
            System.out.println("Tombola");
        }else {
            System.out.println("ambi" + ambi);
            System.out.println("terne" + terne);
            System.out.println("quaterne" + quaterne);
            System.out.println("cinquine" + cinquine);
        }
    }
}