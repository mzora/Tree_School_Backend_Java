package ThreadStampa;

public class ThreadStampa extends Thread {

    String printare;

    public ThreadStampa(String printare){
        this.printare=printare;
    }

    @Override
    public void run() {
        for(int i =0;i<1000;i++){
            System.out.println(printare);
        }
    }
}
