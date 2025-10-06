package com.github.rodiond26.yandex.contest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
//        String str = reader.readLine();
        String str = "4 1";

        String[] s = str.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
//        writer.write(String.valueOf(a + b));

//        reader.close();
//        writer.close();
        System.out.println(a + b);
    }
}
