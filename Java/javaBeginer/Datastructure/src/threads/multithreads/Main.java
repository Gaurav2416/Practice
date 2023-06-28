package threads.multithreads;

public class Main {
    public static void main(String[] args) {
        Thread1 threadOne = new Thread1();

        MyRunnableThread2 mrt = new MyRunnableThread2();
        Thread threadTwo = new Thread(mrt);
//        threadOne.start();
//        threadTwo.start(); normal execution of two thread simultaneously
        threadOne.start();
        try {
            threadOne.join(2000); // the join method will make the thread2  to wait until the thread1 is over or for x time.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadTwo.start();
    }
}
