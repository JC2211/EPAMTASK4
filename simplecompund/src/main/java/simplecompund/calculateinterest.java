package simplecompund;

import java.util.Scanner;
public class calculateinterest {
	int principal;
	double rate_of_interest;
	int tenure;
	int number_of_times;
	int time_elapsed;
	double simple_interest;
	double compound_interest;
	Scanner sc=new Scanner(System.in);
	double[] enterValues()
	{
		
		principal=sc.nextInt();
		rate_of_interest=sc.nextDouble();
		tenure=sc.nextInt();
		number_of_times=sc.nextInt();
		time_elapsed=sc.nextInt();
		simpleinterest s=new simpleinterest();
		simple_interest=s.calculate(principal,rate_of_interest,tenure);
		compoundinterest c=new compoundinterest();
		compound_interest=c.calculateInterest(principal,rate_of_interest,number_of_times,time_elapsed);
		double[] a=new double[2];
		a[0]=simple_interest;
		a[1]=compound_interest;
		sc.close();
		return a;
	}

}
