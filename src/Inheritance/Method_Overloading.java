package Inheritance;

public class Method_Overloading {
    public static void main(String[] args) {
        //overloading
        //same class
        //method with same name and return type
        //method with different types of argument or no. of argument
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2,3,5.8f));
        //multiple variable
        //triple dot symbol
        System.out.println(add(1,3,6,89,4,7,-4,6,-7,45,3));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,float c){
        return (int)(a+b+c);
    }
    //triple dot multiple variable is always use as rightmost argument
    public static int add(int x,int ... a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
