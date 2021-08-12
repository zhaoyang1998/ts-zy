package com.BingFa.RaceTu;

/**
 * 龟兔赛跑案例
 * 1 设置赛道距离  要距离终点越来越近
 * 2 判断比赛是否结束
 * 3 打印出胜利者
 * 4 龟兔赛跑开始
 * 5 让兔子睡觉
 */

public class Race implements Runnable{

    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if (Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            //判读比赛是否结束
            boolean flag = gameOver(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"---->"+i+"步");
        }

    }

    //判断是否完成比赛

    public boolean gameOver(int steps){
        //判断是否有胜利者
        if (winner != null){//已经存在胜利者
            return true;
        }else {
            if (steps>=100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Race race = new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }


}
