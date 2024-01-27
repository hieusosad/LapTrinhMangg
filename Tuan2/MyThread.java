package com.mycompany.laptrinhmang1.Tuan2;
        
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Luong bat dau chay");
    }
    
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
    }
}