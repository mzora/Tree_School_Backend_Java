package ThreadStampa;

public class Main {
    public static void main(String[] args) {
        ThreadStampa th0 = new ThreadStampa("0");
        ThreadStampa th1 = new ThreadStampa("1");

        th0.start();
        th1.start();
    }
}
