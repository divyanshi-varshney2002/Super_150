package Graph;

import java.util.*;

//Minimum Spanning  Tree
//Input
//        4 5
//        1 2 10
//        2 3 15
//        1 3 5
//        4 2 2
//        4 3 40
//Output
//        1 1@0
//        3 1@5
//        2 1@10
//        4 2@2

public class Prims {
    private HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
    public Prims(int v){
        for(int i=1;i<=v;i++)
            map.put(i,new HashMap<>());
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public class Primspair{
        int vtx;
        int acqvtx;
        int cost;
        public Primspair(int vtx,int acqvtx,int cost){
            this.vtx=vtx;
            this.acqvtx=acqvtx;
            this.cost=cost;
        }
        public String toString(){
            return this.vtx+" "+this.acqvtx+"@"+this.cost;
        }
    }
    public void Prims_Algo(){
        PriorityQueue<Primspair> pq=new PriorityQueue<>(new Comparator<Primspair>() {
            @Override
            public int compare(Primspair o1, Primspair o2) {
                return o1.cost- o2.cost;
            }
        });
        pq.add(new Primspair(1,1,0));
        HashSet<Integer> visited=new HashSet<>();
        while(!pq.isEmpty()){
            Primspair rp=pq.poll();
            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for (int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    Primspair np=new Primspair(nbrs,rp.vtx,map.get(rp.vtx).get(nbrs));
                    pq.add(np);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Prims p=new Prims(n);
        int m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int cost=sc.nextInt();
            p.AddEdge(v1,v2,cost);
        }
        p.Prims_Algo();
    }
}
