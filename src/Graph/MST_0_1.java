package Graph;

import java.util.*;

public class MST_0_1 {
    private HashMap<Integer, List<Integer>> map=new HashMap<>();
    public MST_0_1(int v){
        for(int i=1;i<=v;i++)
            map.put(i,new ArrayList<>());
    }
    public void AddEdge(int v1,int v2){
        map.get(v1).add(v2);
        map.get(v2).add(v1);
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
    public int Prims_Algo(){
        PriorityQueue<Primspair> pq=new PriorityQueue<>(new Comparator<Primspair>() {
            @Override
            public int compare(Primspair o1,Primspair o2) {
                return o1.cost- o2.cost;
            }
        });
        pq.add(new Primspair(1,1,0));
        HashSet<Integer> visited=new HashSet<>();
        int sum=0;
        while(!pq.isEmpty()){
            Primspair rp=pq.poll();
            if(visited.contains(rp.vtx)){
                continue;
            }
            visited.add(rp.vtx);
//            System.out.println(rp);
            sum+=rp.cost;
            for (int nbrs=1;nbrs<=map.size();nbrs++){
                if(!visited.contains(nbrs)){
                    int cost=0;
                    if(map.get(rp.vtx).contains(nbrs)){
                        cost=1;
                    }
                    Primspair np=new Primspair(nbrs,rp.vtx,cost);
                    pq.add(np);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        MST_0_1 mst=new MST_0_1(n);
        for (int i = 0; i < m; i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            mst.AddEdge(v1,v2);
        }
        System.out.println(mst.Prims_Algo());
    }
}
