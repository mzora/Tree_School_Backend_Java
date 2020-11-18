package SommaParallela;

public class SumInThreads extends Thread{
    public int[]arr;

    private int result=0;

    public SumInThreads(int[]arr){
        this.arr=arr;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        for(int i=0;i<(this.arr.length);i++){
            result+=arr[i];
        }
    }
}
