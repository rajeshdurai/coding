import java.util.Scanner;
public class Count {
public static void main(String[] args) {
	   
	    Scanner get=new Scanner(System.in);
	    System.out.println("Number of Coins ");
	    int count=get.nextInt();
	    int arr[]=new int[count];
	    for(int i=0;i<count;i++)
	    {
	        arr[i]=get.nextInt();
	    }
	    System.out.println("Enter the sum value");
	    int sum=get.nextInt();
	    int sub;
	    int coin=0;
	    while(sum!=0)
	    {
	        sub=0;
	        sub=sum/arr[count-1];
	        if(sub!=0)
	        {
	            System.out.println(sub+" Coin of "+arr[count-1]);
	        }
	            sum=coin+sum%arr[count-1];
	            count--;
	        }
	    }
	}
