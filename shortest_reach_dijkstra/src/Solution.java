import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the shortestReach function below.
    static int[] shortestReach(int n, int[][] edges, int s) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < edges.length; i++) {
            matrix[edges[i][0]-1][edges[i][1]-1] = edges[i][2];
            matrix[edges[i][1]-1] [edges[i][0]-1]= edges[i][2];
        }

        // The output array. dist[i] will hold
        // the shortest distance from src to i
        int[] dist = new int[n];

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean[] sptSet = new Boolean[n];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        s = s - 1; //we use the index as id for vertices
        dist[s] = 0;

        for (int count = 0; count < n - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet, n);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < n; v++) {
                if (!sptSet[v] && matrix[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + matrix[u][v] < dist[v])
                    dist[v] = dist[u] + matrix[u][v];
            }

        }

        // print the constructed distance array
        //        printSolution(dist, n);
        return removeSource(dist, n);
    }

    static int minDistance(int dist[], Boolean sptSet[], int n)
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < n; v++)
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance array
    static int[] removeSource(int[] dist, int n)
    {
        int[] response = new int[n-1];
        int current = 0;

        for (int i = 0; i < n; i++) {
            if (dist[i] != 0) {
                response[current] = dist[i];
                current++;
            }

            if (dist[i] == Integer.MAX_VALUE) {
                current--;
                response[current] = -1;
            }
        }
        return response;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = shortestReach(n, edges, s);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
