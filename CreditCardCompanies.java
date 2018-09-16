package Assignment2;

public class CreditCardCompanies {
 public static void main(String args[])
 { 
	 int charge=Integer.parseInt(args[0]);
	 System.out.print("Pay Back amount: " +calculatePay(charge));
	 }
 static double calculatePay(int charge){
	 double pay=0;
	 if (charge<=500) {
		 pay=0.0025*charge; 
	 }
	 if (charge>500 && charge<=1500) {
		 pay=0.0025*500+0.0050*(charge-500); 
	 }
	 if (charge>1500 && charge<=2500) {
		 pay=0.0025*500+0.0050*1000+0.0075*(charge-1500);
	 }
	 if (charge>2500) {
	 
		 pay=0.0025*500+0.0050*1000+0.0075*1000+0.01*(charge-2500);
	 }
	 
	 return pay;
 }

}
