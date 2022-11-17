package Inheritance;

public class Client {
    public static void main(String[] args) {
//        P obj=new P();
//        C obj1=new C();

        //case1
//        P obj=new P();
//        System.out.println(obj.d);//1
//        System.out.println(obj.d1);//10
//        obj.fun();
//        obj.fun1();

        //case2
        P obj=new C();
        System.out.println(obj.d);//1
        System.out.println(obj.d1);//10
        System.out.println(((C)(obj)).d2);//20  -type cast the object to access the members of the class
        System.out.println(((C)(obj)).d);//2
        obj.fun();
        obj.fun1();
    }
}
