package Assignment2;
import java.util.*;
import java.text.*;
 
public class CalculateCylinderVolume {

	public static double cylinder(double r,double l)
	{
	double volume;
	volume=3.14*(r*r)*l;
	return volume;
	}
	public static void main(String[] args) 
	{ 
	DecimalFormat df = new DecimalFormat("00.00");
	double PI=3.14;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the Radius: ");
	double r=input.nextDouble();
	System.out.print("Enter the Height: ");
	double h=input.nextDouble();
	 
	double volume=PI*r*r*h;
	System.out.println("Volume of the Cylinder: "+df.format(volume));
	}


}
