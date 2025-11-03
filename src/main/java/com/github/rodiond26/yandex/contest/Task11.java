package com.github.rodiond26.yandex.contest;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
        String str = reader.readLine();
        int n = Integer.parseInt(str);
        Map<String, String> map = new HashMap<>(n * 2);

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] words = line.split(" ");
            if (words.length == 2) {
                map.put(words[0], words[1]);
                map.put(words[1], words[2]);
            }
        }

        String find = reader.readLine();
        String result = map.get(find);
        writer.write(result);

        reader.close();
        writer.close();
    }
}
