package Graphs;

public class mainGraph {
    public static void main(String[] args) {
        graph g=new graph();
        g.add(1,2);
        g.add(1,3);
        g.add(2,4);
        g.add(3,4);

        g.printGraph();
        g.bfs(3);
        g.dfs(4);
    }
}
