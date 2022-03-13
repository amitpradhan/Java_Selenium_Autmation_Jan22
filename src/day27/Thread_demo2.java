package day27;

public class Thread_demo2 extends Thread{
    @Override
    public void run(){
        for (int i =0; i<20; i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread_demo2 t1 = new Thread_demo2();
        t1.setName("Selenium Thread-1");
        t1.setPriority(5);
        t1.start();
        System.out.println("Thread1 name ->"+t1.getName());
        System.out.println("Thread1 ID ->"+t1.getId());
        System.out.println("Thread1 priority-> "+t1.getPriority());
        System.out.println("Thread1 state after start->"+t1.getState());
        Thread.sleep(1000);
        System.out.println("Thread1 state after execution->"+t1.getState());

        System.out.println("************************************************************");

        Thread_demo2 t2 = new Thread_demo2();
        t2.setName("Webdriver Thread-2");
        t2.setPriority(1);
        t2.start();
        System.out.println("Thread2 name ->"+t2.getName());
        System.out.println("Thread2 ID ->"+t2.getId());
        System.out.println("Thread2 priority-> "+t2.getPriority());
        System.out.println("Thread2 state after start->"+t2.getState());
        Thread.sleep(1000);
        System.out.println("Thread2 state after execution->"+t2.getState());

    }
}
