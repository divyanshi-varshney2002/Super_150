package Graph;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public  Graph(int v){
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        //both direction update
        map.get(v1).put(v2,cost);//v1-->v2
        map.get(v2).put(v1,cost);//v2-->v1
    }
    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int NoOfVertex(){
        return map.size();
    }
    public int NoOfEdges(){
        int c=0;
        for(int key:map.keySet()){
            c+=map.get(key).size();//chotey wale hashmap ka size
        }
        return c/2;
    }
    public void RemoveEdge(int v1,int v2){
        if(ContainsEdge(v1,v2)){//check contains edge or not
            map.get(v1).remove(v2);//v1-->v2 X
            map.get(v2).remove(v2);//v2-->v1 X
        }
    }
    public void RemoveVertex(int v1){
        for(int key:map.get(v1).keySet()){
            map.get(key).remove(v1);//andar walo m se delete kiya h
        }
        map.remove(v1);//phir bahar wala poora hta diya
    }
    public void Display(){
        for(int key:map.keySet()){
            System.out.println(key+"-->"+map.get(key));
        }
    }

    public boolean HasPath(int src, int des, HashSet<Integer> visited){
        if(src==des) return true;
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                boolean ans = HasPath(nbrs, des, visited);
                if (ans) return ans;
            }
        }
        visited.remove(src);
        return false;
    }

    public void PrintAllPath(int src, int des, HashSet<Integer> visited,String ans){
        if(src==des){
            System.out.println(ans+des);
            return;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                PrintAllPath(nbrs,des,visited,ans+src+"-->");
            }
        }
        visited.remove(src);
        return ;
    }
}
