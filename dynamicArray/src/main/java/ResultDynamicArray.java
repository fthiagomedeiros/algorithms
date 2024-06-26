import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ResultDynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        Map<Integer, List<Integer>> arr = new HashMap();

        List<Integer> result = new ArrayList<>();
        int index;

        for (int i = 0; i < queries.size(); i++) {

            List<Integer> currentQuery = queries.get(i);
            index = ((currentQuery.get(1) ^ lastAnswer)) % n;

            if (currentQuery.get(0) == 1) {


                if (!arr.containsKey(index)) {
                    arr.put(index, new ArrayList<>());
                    arr.get(index).add(currentQuery.get(2));
                } else {
                    arr.get(index).add(currentQuery.get(2));
                }

            } else {
                lastAnswer = arr.get(index).get(currentQuery.get(2) % arr.get(index).size());
                result.add(lastAnswer);
            }

        }

        return result;
    }

}

//class Solution {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(
//            new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int q = Integer.parseInt(firstMultipleInput[1]);
//
//        List<List<Integer>> queries = new ArrayList<>();
//
//        IntStream.range(0, q).forEach(i -> {
//            try {
//                queries.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<Integer> result = ResultDynamicArray.dynamicArray(n, queries);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//                + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//
//}
