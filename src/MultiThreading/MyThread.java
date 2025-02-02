package MultiThreading;

public class MyThread implements Runnable{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args){
        Thread t1 = new Thread(new MyThread());
        t1.start();

    }
        }
