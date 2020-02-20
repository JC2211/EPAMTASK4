package simplecompund;

public class Main {
	public static void main(String[] args) {
		calculateinterest calculate=new calculateinterest();
		double simple_interest;
		double compound_interest;
		double[] a=new double[2];
		a=calculate.enterValues();
		simple_interest=a[0];
		compound_interest=a[1];
		System.out.println("Simple Interest:"+simple_interest);
		System.out.println("Compound Interest:"+compound_interest);
		
	}

}
