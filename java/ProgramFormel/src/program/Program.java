package program;

import java.lang.Math;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		if (args.length == 3) {
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			c = Double.valueOf(args[2]);
		} else {
			Triple<Double,Double,Double> tmp= input();
			a= tmp.item1;
			b=tmp.item2;
			c=tmp.item3;
		}

		System.out.println("x1="+(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
		System.out.println("x2="+(-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));

	}
	private static Triple<Double,Double,Double> input(){
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		a = Double.valueOf(sc.nextFloat());
		System.out.print("b: ");
		b = Double.valueOf(sc.nextFloat());
		System.out.print("c: ");
		c = Double.valueOf(sc.nextFloat());
		sc.close();
		return new Triple<Double,Double,Double>(a, b, c);
	}

}

