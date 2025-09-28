package com.github.rodiond26.yandex.contest;

import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        int[] triangle = new int[3];
        for (int i = 0; i < 3; i++) {
            triangle[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(triangle);

        if (triangle[0] + triangle[1] > triangle[2]) {
            writer.write("YES");
        } else {
            writer.write("NO");
        }

        reader.close();
        writer.close();
    }
}