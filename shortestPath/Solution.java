import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Solution {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");
            int nodesSize = Integer.parseInt(nm[0]);
            int edgesSize = Integer.parseInt(nm[1]);

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            DijkstraGraph g = new DijkstraGraph(nodesSize, edgesSize);

            for (int i = 0; i < edgesSize; i++) {
                String[] vertices = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int sourceVertices = Integer.parseInt(vertices[0]);
                int destinationVertices = Integer.parseInt(vertices[1]);
                g.includeEdge(sourceVertices, destinationVertices);
            }

            int source = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = g.shortestReach(source);

            for (int i = 1; i < result.length; i++) {
                if (i == source) {
                    continue;
                }

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

    public static class DijkstraGraph {

        private final List<List<Integer>> adjLst;
        private final int size;

        public DijkstraGraph(int nodes, int edges) {
            adjLst = new ArrayList<>();
            this.size = nodes;
            while(nodes-- > -1) {
                adjLst.add(new ArrayList<>());
            }
        }

        public void includeEdge(int first, int second) {
            // For an undirected graph, you gotta add edges from both sides.
            adjLst.get(first).add(second);
            adjLst.get(second).add(first);
        }

        public int[] shortestReach(int source) {
            int[] distances = new int[size + 1];
            Arrays.fill(distances, -1); // O(n) space.

            Queue<Integer> queue = new LinkedList<>();
            HashSet<Integer> seen = new HashSet<>();

            queue.add(source);

            //always the distance for source is 0
            distances[source] = 0;
            seen.add(source);

            while (!queue.isEmpty()) {
                Integer curr = queue.poll();
                for(int node : adjLst.get(curr)) {
                    if(!seen.contains(node)) {
                        queue.offer(node);
                        // Right place to add the visited set.
                        seen.add(node);
                        // keep on increasing distance level by level.
                        distances[node] = distances[curr] + 6;
                    }
                }
            }

            return distances;
        }

    }
}