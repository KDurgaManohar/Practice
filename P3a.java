import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j,max=0;
	    int a[][]=new int[n][n];
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            a[i][j]=sc.nextInt();
	            if(max<a[i][j]){
	                max=a[i][j];
	            }
	        }
	    }
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	        System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.println("The Biggest Number in an array "+max);
	    
	}
}
