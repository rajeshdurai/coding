
public class Power
{
public static void main(String[] args) 
{
	int sum=0;
		int b;
		int a=Integer.parseInt(args[0]);
		int s=args[0].length();
		System.out.println("the value of integer is:"+a);
		while(s!=0)
		{
		
			s=s-1;
			b=a%10;
			sum=(int) (sum+Math.pow(b,s));
			a=a/10;
			}
		System.out.println("the power of sum is"+sum);
}

}
