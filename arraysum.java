import java.util.*;

class arraysum
{
	public static void main(String[] arg)
	{
	int[] arr;
	int i,sum=0;
	
	Scanner a= new Scanner(System.in);
	arr= new int[5];
	System.out.println("enter the five array elements");
	
	for(i=0;i<=4;i++)
	{
		arr[i]= a.nextInt();
		sum=sum + arr[i];
	}
	System.out.println("sum of array elements="+sum);
	
	}	
}