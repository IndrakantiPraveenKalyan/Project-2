package Assignment2;

public class GrossPay {
public static void main(String args[]){
	int gp=Integer.parseInt(args[0]);
	System.out.print("Tax Was Owed " + calTax(gp));
	}
static double calTax(int gp) { 
	double tax=0;
	if (gp<=240) {
		tax=0;}
	if (gp>240 && gp<=480) {
		tax=0.15;}
	if (gp>480) {
		tax=0.28;}
	double owedTax=tax*gp;
	return owedTax;
}
}
