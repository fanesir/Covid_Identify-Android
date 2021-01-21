package com.example.test;

public class MyTimer extends Thread {
    private final int sec;
    private final Callback callback;

    interface Callback {
        void tick();
    }

    MyTimer(int sec, Callback callback) {
        this.sec = sec;
        this.callback = callback;
    }

    @Override
    public void run() {
        long after = System.currentTimeMillis();
        while (true) {
            long now = System.currentTimeMillis();
            if (now - after > this.sec * 1000) {
                // TODO: alert
                this.callback.tick();
                after = now;
            }
        }
    }
}

class A implements MyTimer.Callback {


    @Override
    public void tick() {

    }
}



class Main1 {
    public static void main(String[] argc) {

        MyTimer myTimer = new MyTimer(3, new A());


        MyTimer myTimerr = new MyTimer(3, new MyTimer.Callback() {
            int i = 0;

            @Override
            public void tick() {

                this.i++;
                System.out.print("a");
            }
        });



    }
}