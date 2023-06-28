package threads;

public class MyThread extends Thread{

    /*
    * Thread =  A thread of execution is a program (kind of like a virtual CPU).
    *           The JVM allows an application to have multiple thread running concurrently.
    *           Each thread can execute part of your code in parallel with the main thread
    *           Each thread has a priority. The thread with the highest priority is executed first.
    * The execution of the thread is stopped if
    * 1. If the exit method of the class Runtime has been called
    * 2. All user threads have died.
    *
    * When JVM starts up, there is a thread which calls the main method. This thread is called is main
    *
    * The types of threads.
    * 1. Daemon thread is low priority thread that runs in background to perform tasks such as garbage collections
    *    JVM terminates itself when all user threads (non daemon threads) finish their execution
    * */

//    One way to declare threads is
    @Override
    public void run(){
        if (this.isDaemon()){
            System.out.println("This is daemon thread");
        }else{
            System.out.println("This is user thread running");
            }
    }
}
