package day27;

public class Thread_Demo1 extends Thread  {
/**
 * 1- Extend Thread class
 * 2- Override run()
 * 3- In main method create object of your class
 * 4- Call start() which starts the thread and executes overridden run()
 */

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
        System.out.println("*************************THREAD 1*****************");
        Thread_Demo1 thread1 = new Thread_Demo1();
        System.out.println("Thread1 state before start->"+thread1.getState());
        thread1.start();
        System.out.println("Thread1 name ->"+thread1.getName());
        System.out.println("Thread1 ID ->"+thread1.getId());
        System.out.println("Thread1 priority-> "+thread1.getPriority());
        System.out.println("Thread1 state after start->"+thread1.getState());
        Thread.sleep(1000);
        System.out.println("Thread1 state after execution->"+thread1.getState());


        System.out.println("******************THREAD -2 ********************");
        Thread_Demo1 thread2 = new Thread_Demo1();
        System.out.println("Thread2 state before start->"+thread2.getState());
        thread2.start();
        System.out.println("Thread2 name ->"+thread2.getName());
        System.out.println("Thread2 ID ->"+thread2.getId());
        System.out.println("Thread2 priority-> "+thread2.getPriority());
        System.out.println("Thread2 state after start->"+thread2.getState());
        Thread.sleep(1000);
        System.out.println("Thread2 state after execution->"+thread2.getState());
    }

}

