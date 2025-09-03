package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Value of First Number?: ");
		double x = in.nextInt();
        System.out.print("Value of Second Number?: ");
		double y = in.nextInt();
        System.out.println("The average of "+x+" and "+y+" is "+(x+y)/2);
    }
}
