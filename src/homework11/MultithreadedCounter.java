package homework11;

public class MultithreadedCounter implements Runnable{
    static int counter;

    public MultithreadedCounter() {
    }


    public static void main(String[] args) {

        MultithreadedCounter te = new MultithreadedCounter();
        Thread th1 = new Thread(te);
        th1.start();
        Thread th2 = new Thread(te);
        th2.start();
        Thread th3 = new Thread(te);
        th3.start();
        Thread th4 = new Thread(te);
        th4.start();
        Thread th5 = new Thread(te);
        th5.start();
        Thread th6 = new Thread(te);
        th6.start();
        Thread th7 = new Thread(te);
        th7.start();
        Thread th8 = new Thread(te);
        th8.start();
        Thread th9 = new Thread(te);
        th9.start();
        Thread th10 = new Thread(te);
        th10.start();
    }

    static synchronized void nextCounter() {
        counter++;
        System.out.println(Thread.currentThread().getName() + ": " + counter);

    }

    @Override
    public void run() {
        while(counter < 1000){
            nextCounter();
        }
        }
}
