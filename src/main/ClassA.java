package main;

import java.io.IOException;
import java.io.PrintWriter;

public class ClassA {
    public static void main(String[] args) {
        System.out.println("pewpew");

        String s;
    }

    public static void doit(int no) throws IOException {
        for (int i = 0; i < no; i++) {
            String fileName = "name" + i + ".txt";
            PrintWriter printer = new PrintWriter(fileName, "UTF-8");

        }
    }
}