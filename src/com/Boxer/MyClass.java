package com.Boxer;

public class MyClass<T>{

    private T t;

    public MyClass(T t) {
        this.t = t;
    }
    public void showType(){
        System.out.println(this.t.getClass().getSimpleName());
    }
}
