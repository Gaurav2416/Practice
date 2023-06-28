package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Mainn");
        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().isAlive());

//        Creating instance of My thread

        MyThread m = new MyThread();
        System.out.println("\nMy new thread");
        m.start();
        System.out.println(m.activeCount());
        System.out.println(m.isAlive());
        m.setName("2nd thread");
        System.out.println(m.getName());
        System.out.println(m.getPriority());

        MyThread m1 = new MyThread();
        System.out.println("\nMy new daemon thread");
        m1.setDaemon(true);
//        System.out.println(m1.isDaemon());
        m1.start();
        System.out.println(m1.activeCount());

        m1.setName("daemon thread");
        System.out.println(m1.getName());
        System.out.println(m1.getPriority());
    }
}
