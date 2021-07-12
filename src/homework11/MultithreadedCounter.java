package homework11;

public class MultithreadedCounter implements Runnable{
    static int counter;

    public MultithreadedCounter() {
    }


    public static void main(String[] args) {

        MultithreadedCounter mtc = new MultithreadedCounter();
        Thread th1 = new Thread(mtc);
        th1.start();
        Thread th2 = new Thread(mtc);
        th2.start();
        Thread th3 = new Thread(mtc);
        th3.start();
        Thread th4 = new Thread(mtc);
        th4.start();
        Thread th5 = new Thread(mtc);
        th5.start();
        Thread th6 = new Thread(mtc);
        th6.start();
        Thread th7 = new Thread(mtc);
        th7.start();
        Thread th8 = new Thread(mtc);
        th8.start();
        Thread th9 = new Thread(mtc);
        th9.start();
        Thread th10 = new Thread(mtc);
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
