import java.io.*;
import java.util.*;
public class P2f
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=n;
	    int fac=1;
	    if(n==0){
	        System.out.println("factorial of "+n+" is 1");
	    }
	    else{
	    while(n!=0){
	        fac=fac*n;
	        n=n-1;
	    }
	    System.out.println("factorial of "+a+" is "+fac);
	}
	}
}
