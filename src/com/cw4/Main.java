package com.cw4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        List<String> myList = new ArrayList<String>();
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\kacpe\\Desktop\\CountryCapital.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                myList.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
        /*for (String a:myList) {
            System.out.println(a + "\n");
        }*/

        List<String>a = new ArrayList<String>();
        List<String>b = new ArrayList<String>();

        System.out.println("=============");
       /* //System.out.println(myList.get(1));System.out.println(myList.size());
        int aa=myList.get(1).indexOf('|')-1;
        //System.out.println(aa + "aa");
        *//*System.out.println(aa);
        int bb = myList.get(0).lastIndexOf(myList.get(0));
        System.out.println(myList.get(0));
        System.out.println(bb + " = bb");
        System.out.println(myList.get(0).length() + " = length");
        a.add(myList.get(0).substring(0, aa));
        b.add(myList.get(0).substring(aa+3));
        *//**//*System.out.println(a + " = a");

        //myList.get(0).substring(aa, myList.get(0).indexOf('\n')-1)
        System.out.println(b+ " = b");*/

        for (int i = 0; i < myList.size() ; i++) {
            a.add(myList.get(i).substring(0,myList.get(i).indexOf('|')-1));
            b.add(myList.get(i).substring(myList.get(i).indexOf('|')-1+3));
        }
        /*System.out.println();
        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();*/

        //Map<String,String> myMap = new HashMap<>();
        Map<String,String> myMap = new LinkedHashMap<>();
        //Map<String,String> myMap = new TreeMap<>();
        for (int i = 0; i < a.size(); i++) {
            myMap.put(a.get(i), b.get(i));
        }
        //myMap.forEach((key,value)-> System.out.println(key + " - " + value));
        //System.out.println(Arrays.asList(myMap));

        Student s1 = new Student("kacper");
        Student s2 = new Student("marcin");
        Student s3 = new Student("max");
        Student s4 = new Student("kamil");

        Przedmiot ppj = new Przedmiot("ppj",1);
        Przedmiot gui = new Przedmiot("gui",2);
        Przedmiot sop = new Przedmiot("sop",3);
        Przedmiot pjc = new Przedmiot("pjc",2);
        Przedmiot alg = new Przedmiot("alg",2);
        Przedmiot rbd = new Przedmiot("rbd",1);
        Przedmiot ang = new Przedmiot("ang",3);

        Map<Student,List<Przedmiot>> map = new TreeMap<>();
        map.put(s1.ustalGrupe("27c"),Arrays.asList(ppj,gui,sop));
        map.put(s2.ustalGrupe("21c"),Arrays.asList(rbd,gui,pjc));
        map.put(s3.ustalGrupe("23c"),Arrays.asList(ppj,ang,sop));
        map.put(s4.ustalGrupe("pog"),Arrays.asList(alg,gui,sop));
        System.out.println();

        map.forEach((stud,prz)-> System.out.println(stud + " XXX " + prz));








    }
}//C:\Users\kacpe\Desktop\CountryCapital.txt
