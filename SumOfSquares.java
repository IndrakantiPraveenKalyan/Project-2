package Assignment2;
import java.util.*;
public class SumOfSquares {

	public static void main(String[] args) 
	{
	int sum=0,sum1=0,sum2=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter value of n: ");
	int n=input.nextInt();
	for(int i=1;i<=n;i++)
	{
	int square=i*i;
	sum1+=square;
	}
	System.out.println(sum1);
	for(int i=1;i<=n;i++)
	{
	sum+=i;
	}
	sum2=sum*sum;
	System.out.println(sum2);
	int difference=0;
	if(sum1>sum2)
	{
	difference=sum1-sum2;
	}
	else
	{
	difference=sum2-sum1;
	}
	System.out.println(difference);
	}
	}

