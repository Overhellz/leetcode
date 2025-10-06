package com.github.rodiond26.yandex.contest;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
        String input = reader.readLine();
        String[] str = input.split(" ");


        int[] arr = new int[str.length];

        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }



        int count = 0;
        for(int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                count++;
            }
        }

        writer.write(String.valueOf(count));

        reader.close();
        writer.close();
    }
}
