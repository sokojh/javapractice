package com.company;

public class DemonThread implements Runnable{


    @Override
    public void run() {
         while(true){
             System.out.println("데몬 쓰레드가 실행중입니다");
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
                 break;
             }

         }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DemonThread());
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(1000);
        System.out.println("종료되었습니다.");
    }

}
