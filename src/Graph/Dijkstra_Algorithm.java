package Graph;

import java.util.HashSet;
import java.util.Set;

public class Dijkstra_Algorithm {
    private class Dijkstra_Pair{
        int vtx;
        String acq_path;
        int cost;
        public Dijkstra_Pair(int vtx,String acq_path,int cost){
            this.acq_path=acq_path;
            this.cost=cost;
            this.vtx=vtx;
        }
    }
    public void DijkstaAlgo(){
//        Set<Integer> visited =new HashSet<>();
//        pq.add(new Dijkstra_Pair(1,"1",0));
//        while(!pq.isEmpty()){
//            Dijkstra_Pair rp=pq.remove();
//            if(visited.contains(rp.vtx)){
//                continue;
//            }
//            visited.add(rp.vtx);
//            System.out.println(rp);
//            for(int nbrs:map.get(rp.vtx).keySet()){
//                if(!visited.contains(nbrs)){
//                    int cost=rp.
//                }
//            }
//        }
    }
}
