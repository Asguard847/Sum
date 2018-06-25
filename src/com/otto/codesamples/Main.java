package com.otto.codesamples;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\Asguard\\IdeaProjects\\StupidABBAChief\\input.txt"));
        PrintWriter pw = new PrintWriter(new File("C:\\Users\\Asguard\\IdeaProjects\\StupidABBAChief\\output.txt"));

        String number1 = sc.next();
        String number2 = sc.next();
        String number3 = sc.next();

        String bigger = getBiggest(number1, number2);
        String biggest = getBiggest(bigger, number3);
        pw.println(biggest);
        pw.close();


    }

    public static String getBiggest(String a, String b) {

        if (a.equals(b)) {
            return a;
        } else {

            int lengthA = a.length();
            int lengthB = b.length();

            if (lengthA != lengthB) {
                if (lengthA > lengthB) {
                    return a;
                } else return b;

            } else {
                for (int i = 0; i < lengthA; i++) {
                    char c1 = a.charAt(i);
                    char c2 = b.charAt(i);
                    if (c1 == c2) {
                        continue;

                    } else {
                        if (c1 > c2) {
                            return a;

                        } else {
                            return b;

                        }

                    }
                }
            }


        }

        return "You'll never get to this point, but I still have to write it";
    }
}



