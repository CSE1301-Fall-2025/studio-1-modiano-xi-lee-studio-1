package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("enter:");
		String temp = in.nextLine();
        int year = Integer.parseInt(temp);
        Boolean leap= false;
        if(year%4==0){
            leap = true;
            if(year%100==0){
                leap=false;
                if(year%400==0){
                    leap=true;
                }
            }
        }
        System.out.println(temp+(leap?" is":" is not")+" a leap year");



	}

}
