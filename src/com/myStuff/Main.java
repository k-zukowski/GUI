package com.myStuff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        matrix(in);
        //{{1,2,3,4},{0,1,-1,0},{2,1,4,1}}
    }
    public static void matrix (String in){

        String out;
        out = in.replaceAll("  ","},{");
        out = out.replaceAll(" ",",");
        StringBuilder out2 = new StringBuilder();
        out2.append(out);
        out2.insert(0,"{{");
        out2.insert(out2.length(),"}}");
        //System.out.println(out);
        System.out.println(out2);

    }
}