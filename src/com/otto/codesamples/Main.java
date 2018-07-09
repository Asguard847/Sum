package com.otto.codesamples;

import java.io.*;
import java.util.Scanner;

public class Main {

    static int sum;
    static int inputInt;

    public static void main(String[] args) {
        try {
            inputInt = getInput();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            calculate(inputInt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int getInput() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Asguard\\IdeaProjects\\Sum\\input.txt"));
        int i = sc.nextInt();
        return i;
    }

    public static void writeOutput() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("C:\\Users\\Asguard\\IdeaProjects\\Sum\\output.txt"));
        pw.print(sum);
        pw.close();
    }

    public static void calculate ( int i) throws FileNotFoundException {
            if (i == 1) {
                sum = sum + i;
                writeOutput();
            } else {
                if (i <= 0) {
                    sum = sum + i;
                    i++;
                    calculate(i);
                } else {
                    sum = sum + i;
                    i--;
                    calculate(i);
                }
            }

        }
    }



