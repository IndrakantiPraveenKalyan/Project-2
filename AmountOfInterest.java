package Assignment2;

public class AmountOfInterest {
	public static void main(String[] args)
	{
		double deposit_amount=Double.parseDouble(args[0]);
		if(deposit_amount<=1000)
			System.out.println("The Interest is:"+(deposit_amount*0.04));
		else if(deposit_amount>1000&&deposit_amount<=5000)
			System.out.println("The interest is :"+(deposit_amount*0.045));
		else if(deposit_amount>5000)
			System.out.println("The interest is:"+(deposit_amount*0.05));
	 }
}
