package com.BridgeLabz.LineComparisonProblem;

import java.util.Scanner;

public class LineComparisonProblemUC4 {
	static double lenOfLineFirst, lenOfLineSecond, lenOfLine;
	static int x1, x2, y1, y2, value;

	
	 void  coordinates() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter x1 co-ordinate : ");
	        int x1 = sc.nextInt();
	        System.out.println("Enter x2 co-ordinate : ");
	        int x2 = sc.nextInt();
	        System.out.println("Enter y1 co-ordinate : ");
	        int y1 = sc.nextInt();
	        System.out.println("Enter y2 co-ordinate : ");
	        int y2 = sc.nextInt();

	        lenOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	        
	 }
	 void getLength() {
			coordinates();
			lenOfLineFirst = lenOfLine;
			System.out.println("Enter Values Again for Second Line: ");
			coordinates();
			lenOfLineSecond = lenOfLine;
			System.out.println("Length of Line1: " + lenOfLineFirst);
			System.out.println("Length of Line2: " + lenOfLineSecond);
		}
		
		void compareLines()
		{
			
			if(lenOfLineFirst == lenOfLineSecond)
				System.out.println("Both Lines are Equal");
			
			else if(lenOfLineFirst > lenOfLineSecond)
				System.out.println("Line1 is Greater than Line2");
			
			else
				System.out.println("Line1 is smaller than Line2");
		} 


	public static void main(String[] args)
	{
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		LineComparisonProblemUC4 obj = new LineComparisonProblemUC4();
		obj.getLength();
		obj.compareLines();
	}
}