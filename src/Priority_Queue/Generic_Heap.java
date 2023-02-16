package Priority_Queue;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {
    private ArrayList<T> list= new ArrayList<>();
    public void add(T item){
        list.add(item);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(islarger(list.get(pi), list.get(ci))>0)
        {
            Swap(pi,ci);
            upheapify(pi);
        }
    }
    public void Swap(int i,int j)
    {
        T ith= list.get(i);
        T jth= list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public T max()
    {
        Swap(0,list.size()-1);
        T rv=list.remove(list.size()-1);
        downhaepify(0);
        return rv;
    }

    private void downhaepify(int pi) {
        int lci=2*pi+1;
        int rci=2*pi+2;
        int minIndex=pi;
        if(lci<list.size() && islarger(list.get(minIndex),list.get(lci))>0)
        {
            minIndex=lci;
        }
        if(rci <list.size() && islarger(list.get(minIndex),list.get(rci))>0)
        {
            minIndex=rci;
        }
        if(minIndex!=pi)
        {
            Swap(minIndex,pi);
            downhaepify(minIndex);
        }
    }
    public T min()
    {
        return list.get(0);
    }
    public int size()
    {
        return list.size();
    }
    public void display()
    {
        System.out.println(list);
    }
    public int islarger(T o1,T o2)
    {
        return o1.compareTo(o2);
    }
}