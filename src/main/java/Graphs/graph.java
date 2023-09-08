package Graphs;

import java.util.*;

public class graph {

    Map<Integer, Set<Integer>> adjMap;

    public graph() {
        adjMap = new HashMap<>();
    }

    public void add(Integer s, Integer d) {
        Set<Integer> set = adjMap.getOrDefault(s, new HashSet<>());
        set.add(d);
        adjMap.put(s, set);

        set = adjMap.getOrDefault(d, new HashSet<>());
        set.add(s);
        adjMap.put(d, set);
    }

    public void printGraph() {
        for (Map.Entry<Integer, Set<Integer>> entry : adjMap.entrySet()) {
            Integer vertex = entry.getKey();
            Set<Integer> neighbor = entry.getValue();

            System.out.print("vertix: " + vertex + " connected to: ");
            for (Integer neighbors : neighbor) {
                System.out.print(neighbors + " ");
            }
            System.out.println();
        }
    }


    public void bfs(Integer start) {
        List<Integer> visited = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer vertex = queue.poll();
            System.out.print(vertex + " ");

            Set<Integer> neighbour = adjMap.get(vertex);
            if (neighbour != null) {
                for (Integer neighbors : neighbour) {
                    if (!visited.contains(neighbors)) {
                        visited.add(neighbors);
                        queue.add(neighbors);
                    }
                }
            }
        }
        System.out.println();
    }

    public void dfs(Integer start){
        Set<Integer> visited=new HashSet<>();
        dfs(start,visited);
    }

    private void dfs(Integer start,Set<Integer> visited){
       visited.add(start);
       System.out.print(start+" ");

       Set<Integer> neghbour=adjMap.get(start);
       if(neghbour!=null){
           for(Integer neighbours:neghbour){
               if(!visited.contains(neighbours))
                    dfs(neighbours,visited);
           }
       }
    }



}
