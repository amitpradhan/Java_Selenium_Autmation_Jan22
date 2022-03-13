package day27;

public class Thread_demo4 {
    /**
     * 1- Create object of Thread class
     * 2- Create instance of Runnable interface which internally generates an anonymous inner class and only one object will be creates
     * 3- class start()
     */

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
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
        }); //thread-1
        t1.start();
        System.out.println("Thread-1 - >"+t1.getName());


        Thread t2 = new Thread(new Runnable() {
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
        }); //thread-1
        t2.start();
        System.out.println("Thread-2 - >"+t2.getName());


    }
}