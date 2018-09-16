package Assignment2;
import java.util.*;
import java.text.*;
public class OldMovieTheater {
	public static void main(String[] args) 
	{
	DecimalFormat df=new DecimalFormat("$00.00");
	double theaterCost=20;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Number of Customers: ");
	double cus=input.nextDouble();
	double earnFromTickets=5*cus;
	double attendeesCost=cus*0.50;
	double cost=attendeesCost+theaterCost;
	double profit=earnFromTickets-cost;
	System.out.println("Profit: "+df.format(profit));
	}
	}
	 

