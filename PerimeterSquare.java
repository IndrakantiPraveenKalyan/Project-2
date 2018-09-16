package Assignment2;


import java.util.*;
import java.text.*;

public class PerimeterSquare {

public static void main(String[] args) 
{
DecimalFormat df = new DecimalFormat("##.00");
Scanner input=new Scanner(System.in);
System.out.println("Enter Area of a Square:");
double area=input.nextDouble();
double side=Math.sqrt(area);
System.out.println("Side of a Square is: "+df.format(side));
double perimeter=4*side;
System.out.println("Perimeter of a Square is: "+df.format(perimeter));
 
}
}
