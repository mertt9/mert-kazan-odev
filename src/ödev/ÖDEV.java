package ödev;

import java.util.Scanner;

public class ÖDEV {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir a deðeri giriniz.");
		
		double a = scan.nextInt();
		
		System.out.println("Bir b deðeri giriniz.");
		
		double b = scan.nextInt();
		
		System.out.println("Bir c deðeri giriniz.");
		
		double c = scan.nextInt();
		
		double delta=(b*b)-(4*a*c); 
       
		if (delta<0) {
			System.out.println( "Denklemin gerçel sayýlarla ifade edilebilecek bir kökü yoktur.");
		}
		
		else if (delta == 0) {
		
			double x1= -b/(2*a);
				System.out.println("x1=x2= "+x1);
				
			
			 }
		
		else if (delta>0) {
		
		double x1=(b+ Math.sqrt(delta))/(2*a);
		double x2=(-b+ Math.sqrt(delta))/(2*a);
		System.out.println("x1 = "+ x1);
		System.out.println("x2= "+ x2);
		}
		
		
	}
	

}
