package Lec1;
import java.util.*;
public class Test {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	
		if(n>75) System.out.println("A");
		else if(n>65) System.out.println("B");
		else if(n>55) System.out.println("C");
		else if(n>45) System.out.println("D");
		else System.out.println("fail");
		
	}
}
