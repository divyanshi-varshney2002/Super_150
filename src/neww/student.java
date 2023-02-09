package neww;

public class student implements Comparable<student> {
    String name;
    int age;
    public student(String s,int i){
        name=s;
        age=i;
    }
    @Override
    public String toString(){
        return ("["+this.name+","+this.age+"]");
    }

    @Override
    public int compareTo(student o) {
        return this.age-o.age;
    }
}
