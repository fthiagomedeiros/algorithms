import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList,
                                                List<String> queries) {

//        iterating in string s list and counting
//        int[] result = new int[queries.size()];
//
//        for (int i = 0; i < stringList.size(); i++) {
//
//            if (queries.contains(stringList.get(i))) {
//
//                int currentIndex = queries.indexOf(stringList.get(i));
//                result[currentIndex] = result[currentIndex] + 1;
//            }
//
//        }
//
//        // Write your code here
//        return Arrays.stream(result)
//                .boxed()
//                .collect(Collectors.toList());

        List<Long> result = new ArrayList<>();

        //first count the values we have
        Map<String, Long> stringCount = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        for(int i=0; i<queries.size(); i++) {

            if(stringCount.containsKey(queries.get(i)))
                result.add(stringCount.get(queries.get(i)));
            else
                result.add(0L);
        }
        return result.stream()
                .mapToInt(Long :: intValue)
                .boxed()
                .collect(Collectors.toList());
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input2.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = Result.matchingStrings(stringList, queries);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
