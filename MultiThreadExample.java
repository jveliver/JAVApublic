class MyThread extends Thread {
    public void run(){
        for(int i = 1; i <=5 ; i++){
            System.out.println(Thread.currentThread().threadId() + " Value: " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args){
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
    
}

