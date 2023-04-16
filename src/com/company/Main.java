package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int [] array1 = {5,17,350};
        int k = array1.length;
        System.out.println(k);
    }


    public static void newFile(int e, int p) throws Exception {
        FileWriter nFile = new FileWriter("C:\\Users\\kosigin.a\\Documents\\Новый текстовый документ.txt");

        for(int i = e; i <= p; i++) {

            nFile.write(i+"\n");

        }

        nFile.close();
    }
}