import java.util.Scanner;
public class Test5 {
public static void main(String[] args) {
		int n;
		int rem;
		int[] array=new int[30];
		int n=0;
		int output=0;
		Scanner in=new  Scanner(System.in);
		System.out.println("enter the number");
		number=in.nextInt();
		while(number!=0)
		{
			remainder=n%10;
			array[n]=rem;
			n++;
			n=n/10;
		}/*for(int k=0;k<n;k++)
		{
			System.out.println(array[k]);
		}*/
		for(int i=n-1;i>=0;i--)
		{
			if(i==0)
			{
				output=(int)(output+Math.pow(array[i],0));
			}
			else
			{
			output=(int)(output+Math.pow(array[i], array[i-1]));
			}
		}
		System.out.println(output);
}
}
