import java.io.*;
import java.util.*;
public class P3a
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j;
	    int a[][]=new int[n][n];
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	        System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
