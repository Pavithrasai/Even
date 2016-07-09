import java.io.*;
import java.util.*;
import java.lang.*;
public class Even
{
public static void main(String[]args)
{
int n;
System.out.println("Enter the Number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Given number is Even");
}
else 
{
System.out.println("Given number is Odd");
}
}
}
