import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultTest {

    List<List<Integer>> arr = new ArrayList<>();

    @BeforeEach
    public void loadFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test5.txt"));

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    @Test
    public void testBaseCase() throws IOException {

        ResultHourGlass r = new ResultHourGlass();
        int result = r.hourglassSum(arr);

        Assertions.assertEquals(-6, result);


    }

}