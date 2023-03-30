package Graph;

import java.util.*;

public class Course_schedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            HashMap<Integer, List<Integer>> map=new HashMap<>();
            for(int i=0;i<numCourses;i++){
                map.put(i,new ArrayList<>());
            }
            for(int i=0;i<prerequisites.length;i++){
                int v1=prerequisites[i][0];
                int v2=prerequisites[i][1];
                map.get(v2).add(v1);
            }
            return topologicalsort(map);
        }
        public boolean topologicalsort(HashMap<Integer, List<Integer>> map){
            int in[]=indegree(map);
            Queue<Integer> q=new LinkedList<>();
            for(int i=0;i<in.length;i++){
                if(in[i]==0) q.add(i);
            }
            int c=0;
            while(!q.isEmpty()){
                int rv=q.remove();
                c++;
//            System.out.print(rv);
                for(int nbrs:map.get(rv)){
                    in[nbrs]--;
                    if(in[nbrs]==0) q.add(nbrs);
                }
            }
            return c==map.size()?false:true;
        }

        public int [] indegree(HashMap<Integer, List<Integer>> map){
            int[] in=new int[map.size()];
            for(int key:map.keySet()){
                for(int nbrs:map.get(key)){
                    in[nbrs]++;
                }
            }
            return in;
        }
    }
}
