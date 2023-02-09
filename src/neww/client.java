package neww;

public class client {
    public static void main(String[] args) {
        student[] arr=new student[5];
        System.out.println(arr[0]);
        arr[0] =new student("A",1);
        arr[1] =new student("B",2);
        arr[2] =new student("C",3);
        arr[3] =new student("D",4);
        arr[4] =new student("E",5);
        print(arr);
    }
    public static void print(Object[] arr){
        for(Object s:arr){
            System.out.println(s.toString());//normal address print ho raha h
        }
    }
    public static void bubble(student[] arr){
        for(int c=1;c< arr.length-1;c++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].age > arr[i + 1].age) {
                    student temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
