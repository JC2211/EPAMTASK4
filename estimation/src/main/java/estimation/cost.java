package estimation;
import java.util.Scanner;
public class cost {
	String material_standard;
	int total_area;
	String fully_automated;
	cost()
	{
		Scanner sc=new Scanner(System.in);
		material_standard=sc.nextLine();
		fully_automated=sc.nextLine();
		total_area=sc.nextInt();
		estimate e=new estimate();
		e.estimateCost(material_standard,total_area,fully_automated);
	}

}
