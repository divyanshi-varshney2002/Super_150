package neww;

public class student {
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
}
