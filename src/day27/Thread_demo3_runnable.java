package day27;

public class Thread_demo3_runnable implements Runnable{
    /**
     * 1- Implement runnable interface
     * 2- Create Thread object and pass object of your class
     * 3- call start()
     */
    @Override
    public void run() {
        for (int i =0; i<20; i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_demo3_runnable());
        t1.start();
        System.out.println("Thread - >"+t1.getName());

        Thread t2 = new Thread(new Thread_demo3_runnable());
        System.out.println("Thread - >"+t2.getName());
        t2.start();
    }
}
