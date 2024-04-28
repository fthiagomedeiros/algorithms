import java.util.*;

public class ResultHourGlass {

    public int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            List<Integer> first = arr.get(i);
            List<Integer> second = arr.get(i + 1);
            List<Integer> third = arr.get(i + 2);

            for (int j = 0; j <= 3; j++) {
                int currentResult = calculateHourGlass(j, first, second, third);
                if (currentResult > max) {
                    max = currentResult;
                }
            }

        }

        return max;
    }

    private int calculateHourGlass(int j, List<Integer> first, List<Integer> second,
        List<Integer> third) {

        int v1= first.get(j);
        int v2 = first.get(j+1);
        int v3 = first.get(j+2);
        int v4 = second.get(j+1);
        int v5 = third.get(j);
        int v6 = third.get(j+1);
        int v7 = third.get(j+2);

        return v1 + v2 + v3 + v4 + v5 + v6 + v7;
    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("test4.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, 6).forEach(i -> {
//            try {
//                arr.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        int result = Result.hourglassSum(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
