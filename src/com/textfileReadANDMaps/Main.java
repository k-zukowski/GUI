package com.textfileReadANDMaps;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;//read from file by line to list
        List<String> myList = new ArrayList<>();
        try {
            in = new BufferedReader(new FileReader("src/CountryCapital.txt"));
            String str;
            while ((str = in.readLine()) != null)
                myList.add(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
/*
        for (String a:myList) {
            System.out.println(a + "\n");
        }
*/
/*
        List<String>a = new ArrayList<>();
        List<String>b = new ArrayList<>();

        System.out.println("=============");

        System.out.println("second element : " + myList.get(1));
        System.out.println("size of list (lines count) : " + myList.size());
        int aa=myList.get(1).indexOf('|');
        System.out.println("second element index of \"|\" " + aa);
        a.add(myList.get(1).substring(0, aa-1));
        b.add(myList.get(1).substring(aa+2));
        System.out.println("first half : " + a);
        System.out.println("second half : " + b);

        System.out.println("=============");

        for (String s : myList) {
            a.add(s.substring(0, s.indexOf('|') - 1));
            b.add(s.substring(s.indexOf('|') - 1 + 3));
        }
*/
        Map<String,String> myMap2 = new LinkedHashMap<>();
/*
        for (int i = 0; i < a.size(); i++) {
            myMap.put(a.get(i), b.get(i));
        }
        myMap.forEach((key,value)-> System.out.println(key + " - " + value));
*/
        for (String s : myList) {
            myMap2.put(s.substring(0 , s.indexOf('|') - 1)  ,   s.substring(s.indexOf('|') -1 +3));
        }

        System.out.println("============================================================================================1");
        myMap2.forEach((key,value)-> System.out.println(key + " - " + value));
        //System.out.println("============================================================================================2");
        //System.out.println(Arrays.asList(myMap2));
        
        Student<String> s1 = new Student<>("john");
        Student<String> s2 = new Student<>("ash");
        Student<String> s3 = new Student<>("rave");
        Student<String> s4 = new Student<>("sussybaka");

        Subject ppj = new Subject("ppj",1);
        Subject gui = new Subject("gui",2);
        Subject sop = new Subject("sop",3);
        Subject pjc = new Subject("pjc",2);
        Subject alg = new Subject("alg",2);
        Subject rbd = new Subject("rbd",1);
        Subject ang = new Subject("ang",3);

        Map<Student<String>,List<Subject>> map = new TreeMap<>();
        map.put(s1.determineGroup("27c"),Arrays.asList(ppj,gui,sop));
        map.put(s2.determineGroup("21c"),Arrays.asList(rbd,gui,pjc));
        map.put(s3.determineGroup("23c"),Arrays.asList(ppj,ang,sop));
        map.put(s4.determineGroup("2"),Arrays.asList(alg,gui,sop));
        System.out.println();

        map.forEach((stud,subj)-> System.out.println(stud + " XXX " + subj));

    }
}
