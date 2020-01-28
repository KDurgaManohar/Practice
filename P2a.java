import java.io.*;
import java.util.Scanner;
class P2a
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n==0){
System.out.println(n+" is neither negative nor positive");
 }
else if(n>0){
System.out.println(n+" is positive");
}
else if(n<0){
System.out.println(n+" is negative");
}
else{
System.out.println(" An integer number as argument is expected");
}
}
}