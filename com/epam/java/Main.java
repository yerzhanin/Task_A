package com.epam.java;
// Find count of each word in text

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String text = "work wrok fuc*kin work";
        List<String> list = new LinkedList<String>(Arrays.asList(text.split(" ")));
        int i = 0;
        for (int n = 0; n < list.size(); n = 0) {
            String st = list.get(n);
            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                String str = iter.next();
                if (st.equals(str)) {
                    i++;
                    iter.remove();
                }
            }
            System.out.println(st + " : " + i);
            i = 0;
        }
    }
}