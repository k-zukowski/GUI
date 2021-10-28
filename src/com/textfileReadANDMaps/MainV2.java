package com.textfileReadANDMaps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainV2 {
    public static void main(String[] args) {
        BufferedReader in = null;//read from file by line to map
        Map<String,String> myMap3 = new LinkedHashMap<>();
        try {
            in = new BufferedReader(new FileReader("src/CountryCapital.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                myMap3.put(str.substring(0 , str.indexOf('|') - 1)  ,   str.substring(str.indexOf('|') -1 +3));
            }

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

        myMap3.forEach((key,value)-> System.out.println(key + " - " + value));

    }
}
