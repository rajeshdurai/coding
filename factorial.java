import java.util.*;
public class Factorial  
{
public static void main(String ar[])throws Exception
	{
	int a,f=1;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
	f*=i;
	}
	System.out.println("factorial of a given number is:"+f);
	}
	}
