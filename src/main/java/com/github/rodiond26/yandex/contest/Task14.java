package com.github.rodiond26.yandex.contest;

import java.io.*;
import java.util.PriorityQueue;

public class Task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        String str = reader.readLine();
        for (String s : str.split(" ")) {
            int n = Integer.parseInt(s);
            pq.add(-n);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int a = pq.poll() * -1;
            result.append(a).append(" ");
        }
        writer.write(result.toString().trim());

        reader.close();
        writer.close();
    }
}
