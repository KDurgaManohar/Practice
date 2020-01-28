import java.io.*;
import java.util.Scanner;
class P2b
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,count=0;
n=sc.nextInt();
if(n==0||n==1){  
   System.out.println(n+" is neither prime nor composite");      
 }else{
for(int i=2;i<n/2;i++){
if(n%i==0){
System.out.println(n+" is not Prime");
count=1;
break;
}
}
if(count==0){
System.out.println(n+" is prime");
}
}
}
}