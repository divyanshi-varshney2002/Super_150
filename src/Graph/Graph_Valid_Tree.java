package Graph;

import java.util.*;

public class Graph_Valid_Tree {
    class Solution {
        public boolean validTree(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(i,new ArrayList<>());
            }
            for(int i=0;i<edges.length;i++){
                int v1=edges[i][0];
                int v2=edges[i][1];
                map.get(v1).add(v2);
                map.get(v2).add(v1);
            }
            return isValid(map);
        }
        public boolean isValid(HashMap<Integer, List<Integer>> map){
            HashSet<Integer> visited=new HashSet<>();
            Queue<Integer> q=new LinkedList<>();
            int c=0;
            for(int src:map.keySet()) {
                if(visited.contains(src)) continue;
                q.add(src);
                c++;
                while (!q.isEmpty()) {
                    //1.remove
                    int rv = q.poll();
                    //2.Ignore
                    if(visited.contains(rv)) return false;
                    //3.visited
                    visited.add(rv);
                    //4.self work
                    System.out.print(rv+" ");
                    //neighbours add
                    for (int nbrs : map.get(rv))
                        if (!visited.contains(nbrs))
                            q.add(nbrs);
                }
            }
            return c==1;
        }
    }
    public static void main(String[] args) {

    }
}
