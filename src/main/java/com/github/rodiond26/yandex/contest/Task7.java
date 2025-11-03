package com.github.rodiond26.yandex.contest;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        Set<String> words = new HashSet<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] str = line.split(" ");
            words.addAll(Arrays.asList(str));
        }
        writer.write(String.valueOf(words.size()));

        reader.close();
        writer.close();
    }
}
