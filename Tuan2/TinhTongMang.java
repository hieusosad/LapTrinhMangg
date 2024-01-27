package com.mycompany.laptrinhmang1.Tuan2;

public class TinhTongMang {

    public static void main(String[] args) {
        // Mảng số nguyên
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Số luồng
        int numThreads = 2;
        Thread[] ths = new Thread[numThreads];
        // Các luồng tương ứng
        SumCalculator[] cals = new SumCalculator[numThreads];
        // Chạy các luồng
        for (int i = 0; i < numThreads; i++) {
            cals[i] = new SumCalculator(array, i, numThreads);
            ths[i] = new Thread(cals[i]);
            ths[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                ths[i].join(); // Chờ luồng kết thúc
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int totalSum = 0;
        for (SumCalculator c : cals) {
            totalSum += c.getTong1Phan();
        }
        System.out.println("Tổng: " + totalSum);
    }
}

class SumCalculator implements Runnable {
    private int[] array;
    private int startIndex;
    private int chia;
    private int tong1phan;

    public SumCalculator(int[] array, int startIndex, int chia) {
        this.array = array;
        this.startIndex = startIndex;
        this.chia = chia;
        this.tong1phan = 0;
    }

    @Override
    public void run() {
        // Tính tổng của các phần tử dựa trên index
        for (int i = startIndex; i < array.length; i += chia) {
            tong1phan += array[i];
        }
    }

    public int getTong1Phan() {
        return tong1phan;
    }
}