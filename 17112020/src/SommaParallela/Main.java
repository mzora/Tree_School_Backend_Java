package SommaParallela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main extends Thread {
    public static void main(String[] args) {

        int[] myArr = {2,4,6,10,12,3};

        int[] primaMeta = Arrays.copyOfRange(myArr,0,myArr.length/2);
        int[] secMeta = Arrays.copyOfRange(myArr,(myArr.length/2),myArr.length);

        SumInThreads sum1= new SumInThreads(primaMeta);
        SumInThreads sum2 = new SumInThreads(secMeta);

        sum1.start();
        sum2.start();
        try {
           sum1.join();
           sum2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            int result= sum1.getResult()+ sum2.getResult();
            System.out.println(result);
        }

    }
}


