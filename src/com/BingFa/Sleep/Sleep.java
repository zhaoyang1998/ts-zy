package com.BingFa.Sleep;

public class Sleep{
    public static void main(String[] args) {

        try {
            tenDowm();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tenDowm() throws InterruptedException {
        int num = 10;

        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0){
                break;
            }
        }
    }
}
