package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public Topological_Sort(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
    }

    public void topologicalsort(){
        int in[]=indegree();
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int rv=q.remove();
            System.out.print(rv);
            for(int nbrs:map.get(rv).keySet()){
                in[nbrs]--;
                if(in[nbrs]==0) q.add(nbrs);
            }
        }
    }

    public int [] indegree(){
        int[] in=new int[map.size()+1];
        for(int key:map.keySet()){
            for(int nbrs:map.get(key).keySet()){
                in[nbrs]++;
            }
        }
        return in;
    }

    public static void main(String[] args) {
        Topological_Sort t=new Topological_Sort(8);
        t.AddEdge(1,2,0);
        t.AddEdge(2,4,0);
        t.AddEdge(3,1,0);
        t.AddEdge(3,2,0);
        t.AddEdge(4,5,0);
        t.AddEdge(4,6,0);
        t.AddEdge(5,6,0);
        t.AddEdge(7,8,0);
        System.out.println(Arrays.toString(t.indegree()));
        t.topologicalsort();
    }
}
