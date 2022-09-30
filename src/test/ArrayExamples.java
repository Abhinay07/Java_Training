package sample;

import java.lang.reflect.Array;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ary = {"Volvo", "BMW", "BENZ" ,"Martuhi","EcoSport","I20"};
		int[] aryInt = {1,2,3,4};
		String name = "Rakesh";
		Array[] test = new Array[3];
		//test.length;
		String[] nameAry = {"Rakesh","Vamshi","Ravi","Sameer"};
		//Index					0		1		2		3
		//length				1		2		3		4
		//System.out.print(nameAry[3]);
		Double[] doubleAry = {(double) 1254546,(double) 454485};
		
		for(int i=0;i<nameAry.length;i++) {
			System.out.println(nameAry[i]);	
		}
	}

}
