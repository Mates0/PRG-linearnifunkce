package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            int count = 0;
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
            ArrayList<Linearfunction> arrfunctions = new ArrayList<>();
            String nextline = br.readLine();
            while (nextline != null) {
                Linearfunction linearfunction = new Linearfunction();
                linearfunction.content = "";
                linearfunction.content += nextline;
                nextline = br.readLine();
                arrfunctions.add(linearfunction);
                count++;
            }
            bw.write(Integer.toString(count));
            for (int i = 0; i < arrfunctions.size(); i++) {
                System.out.println(arrfunctions.get(i).content);
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("error");
        }
        distinct();
    }
    public static void distinct() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("count_distinct.txt"));
            ArrayList<String> arr2 = new ArrayList<>();
            ArrayList<String> arr3 = new ArrayList<>();
            String nextline = br.readLine();
            String content = "";
            while (nextline != null) {
                arr2.add(nextline);
                content += nextline;
                nextline = br.readLine();
            }
            for (int i = 0; i < arr2.size(); i++) {
                String arrget = arr2.get(i);
                if ((!arrget.equals("e")) && (!arr3.contains(arrget))) {
                    arr3.add(arrget);
                }
            }
            int num = 0;
            for (int i = 0; i < arr3.size(); i++) {
                num++;
            }
            bw.write(Integer.toString(num));
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
