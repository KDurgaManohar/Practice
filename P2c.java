import java.io.*;
import java.util.*;
public class P2c
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int rev=0,a,r=0;
	    int n=sc.nextInt();
	    a=n;
	    while(n!=0){
	        r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	    }
	    if(rev==a){
	        System.out.println(a+" is a palindrome");
	    }
	    else{
	        System.out.println(a+" is not a palindrome");
	    }
	}
}
