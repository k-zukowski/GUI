package com.cw7;

import java.util.ArrayList;
import java.util.List;

public class Buffor {
    private boolean flag = false;

        List<String> listbuff = new ArrayList<>();

        synchronized void put(String s){
            this.listbuff.add(s);
        }
        synchronized void sout(){
            listbuff.toString();
        }

}
