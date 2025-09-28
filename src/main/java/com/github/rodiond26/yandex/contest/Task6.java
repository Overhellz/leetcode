package com.github.rodiond26.yandex.contest;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String line = "She sells sea shells on the sea shore;\n" +
                "The shells that she sells are sea shells I'm sure.\n" +
                "So if she sells sea shells on the sea shore,\n" +
                "I'm sure that the shells are sea shore shells.";
//        while ((line = reader.readLine()) != null) {
            String[] str = line.split(" ");
            for (String s : str) {
                System.out.println("s = " + s);
                if (!map.containsKey(s)) {
                    sb.append(0);
                    sb.append(" ");
                    map.put(s, 1);
                } else {
                    int count = map.get(s);
                    sb.append(count);
                    sb.append(" ");
                    count++;
                    map.put(s, count);
                }
                System.out.println("sb = " + sb);
//                writer.write(sb.toString().trim());
            }
//        }

//        reader.close();
//        writer.close();
    }
}
