package com.mycompany.laptrinhmang1.Tuan2;
public class DaLuong {
    
    public static void main(String[] args) {
        // Gọi các luồng
        Thread t1 = new Thread(new MyRunable("Luong 1"));
        t1.start();

        // Tạo và gọi luồng 2
        Thread t2 = new Thread(new MyRunable("Luong 2"));
        t2.start();
    }

    // Định nghĩa static inner class MyRunable
    public static class MyRunable implements Runnable {
        private String threadName;

        public MyRunable(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            System.out.println("Bat dau thuc hien cong viec trong " + threadName);
            
            // Thực hiện công việc
            for (int i = 0; i <= 5; i++) {
                System.out.println(threadName + " bước " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Ket thuc cong viec trong " + threadName);
        }
    }
}