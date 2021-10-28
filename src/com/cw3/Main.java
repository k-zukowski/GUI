package com.cw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boxer a = new Boxer("surname",66.6,182);//create && add to list objects
        Boxer b = new Boxer("surname2",42,89);
        List <Boxer> boxers = new ArrayList<>();
        Collections.addAll(boxers,a,b,new Boxer("a",1,2));
        System.out.println(boxers);
        for (Boxer x : boxers)
            System.out.println(x + ", ");

        Collections.sort(boxers);//sort using compareTo
        System.out.println("sorted : ");//debug
        System.out.println(boxers);

        /*Comparator<Boxer> box = (b1,b2)->{
            if (b1.getHeight()<b2.getHeight()){
                return 1;
            }else return -1;
        };*/
        MyClass<Integer> m1 = new MyClass<>(1);//show type of arg
        MyClass<Double> m2 = new MyClass<>(.2d);
        MyClass<Boxer> m3 = new MyClass<>(new Boxer("a",2,1));
         m1.showType();m2.showType();m3.showType();
    }
}
