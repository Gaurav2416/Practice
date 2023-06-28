package threads.multithreads;

public class Thread1 extends Thread{
    /*multithreading = Process of executing multiple threads simultaneously
    *                   Help maximum utilization of CPU
    *                   The thread are independent, they dont affect the execution of other threads.
    *                   An exception in one thread will not interrupt other threads.
    *                   Useful for serving multiple clients, multiplayer game or other mutually independent tasks.*/
    @Override
    public void run(){
        for(int i= 10;i>=0;i--){
            System.out.println("Thread Number 1 show time = "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread number 1 is completed");
    }
}
