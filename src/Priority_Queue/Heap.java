package Priority_Queue;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list=new ArrayList<>();
    public void add(int item){
        list.add(item);
        unheapify(list.size()-1);
    }
    private void unheapify(int ci) {
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
        }
    }
    private void swap(int i,int j){
        int ith=list.get(i);
        int jth=list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
}
