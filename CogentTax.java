package Assignment2;
import java.util.*;
import java.text.*;

public class CogentTax {
public static void main(String[]args)
	{
	double taxRate=0.15;
	double hourlyRate=12;
	DecimalFormat df=new DecimalFormat("$00.00");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter No. of Hours Worked: ");
	double hrs=input.nextDouble();
	double gp=hrs*hourlyRate;
	double tax=gp*taxRate;
	double netpay=gp-tax;
	System.out.println("Net Pay is: "+df.format(netpay));
	}
	}

