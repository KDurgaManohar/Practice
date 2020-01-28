import java.io.*;
import java.util.*;
public class P3b
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
	    System.out.println("The Given array is");
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	        System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.println("The reverse of array is");
	    for(i=n-1;i>=0;i--){
	        for(j=n-1;j>=0;j--){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
