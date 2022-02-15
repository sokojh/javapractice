package com.company;

public class MusicBox {
    public synchronized void  playMusicA(){
        for(int i =0;i<10; i++){
            System.out.println("신나는음악");
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void playMusicB(){
        for(int i =0;i<10; i++){
            System.out.println("카페음악");
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void playMusicC(){
        for(int i =0;i<10; i++){
            synchronized(this) {
                System.out.println("잔잔한음악");
            }
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
