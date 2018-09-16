package Assignment2;
import java.util.*;
public class Rocket {

	
	public static void main(String[] args) {
	System.out.println("Enter Seconds:");
	Scanner s=new Scanner(System.in);
	double time=s.nextDouble();
	double acc;
	double g=9.8;
	acc=g;
	double vel=acc*time;
	double h=(vel*time)/2;
	System.out.println("Reached Rocket Height is : " +(h/1000));
	}
	}


