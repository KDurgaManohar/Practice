import java.io.*;
import java.util.*;
public class P2d
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int sum=0,a,r=0;
	    int n=sc.nextInt();
	    a=n;
	    while(n!=0){
	        r=n%10;
	        sum=sum+r;
	        n=n/10;
	    }
	   System.out.println(sum);
	}
}
