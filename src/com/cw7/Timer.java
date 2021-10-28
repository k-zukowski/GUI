package com.cw7;

public class Timer extends Thread{
    protected long time;
    boolean gettingtime=true;

    public long getTime() {
        return time;
    }

    public void start(){
        gettingtime=true;
        while (gettingtime)time+=1L;
    }

    public void interrupt(){
        gettingtime =false;
        getTime();
        time=0L;
    }



}
