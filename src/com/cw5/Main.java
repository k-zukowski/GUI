package com.cw5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list = Arrays.asList(
                "malta", "can6ada", "cuba", "a"
        );

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(list);

        Collections.sort(list,(o1,o2) -> o1.length() - o2.length());

        System.out.println(list);

        Collections.sort(list,Comparator.comparing(String::length));

        System.out.println(list);

        Collections.sort(list,Comparator.comparingInt(String::length));

        System.out.println(list);

        for (String s: list) {
            System.out.print(s.toUpperCase()+ " ");
        }

        System.out.println();
        List<String> nonums= method(list,x -> !x.matches(".*[0-9].*"));
        System.out.println(nonums.toString());

        Arrays.stream(new double[]{1,2,3,4,5,6,78})
                .map(x->Math.sqrt(x))
                .average()
                .ifPresent(System.out::println);
        //==================================================
        HashMap<String, List<String>> map = new HashMap<>();
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\kacpe\\Downloads\\GUI V data.csv"));
        String row;
        while ((row = csvReader.readLine())!=null){
            String[]data = row.trim().replaceAll(";+",";").split(";");
            map.put(data[0],Arrays.asList(data).subList(1, data.length));
        }
        csvReader.close();
        //==================================================
        //System.out.println(map);
        /*String aa = "2;abstract;continue;import;public;throws;;;;;;";
        String bb = aa.trim().replaceAll(";+",";");
        System.out.println(bb);*/

        String nap1 ="Jakis DLugi Napis";
        String  nap2 ="zupelnie inny napis";
        wypiszWyniki(nap1,nap2);
    }

    private static List<String> method(List<String> list , Filter filter) {
        List<String> l =new ArrayList<>();
        for (String s:list) {
            if (filter.doSomething(s))
                l.add(s);
        }
        return l;
    }

    public static void wypiszWyniki(String a,String b){


        a = a.replaceAll(" ","").toLowerCase();
        b = b.replaceAll(" ","").toLowerCase();
        String same="";String notsame="";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i)==b.charAt(j))
                    same+=a.charAt(i);
            }
        }
        String samefinal = Stream.of(same.split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
        System.out.println(samefinal);

        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i))==-1)
                notsame+=a.charAt(i);
        }

        String notsamefinal = Stream.of(notsame.split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
        System.out.println(notsamefinal);



    }

}
