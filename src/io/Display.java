package io;

public class Display {
	public static void main(String[] args) {
		String leftAlignFormat = "| %-15s | %-15d | %-15d | %-15d |%n";

		System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");
		System.out.printf("|No	 	  |Title	    |Author	      | 	Date    |%n");
		System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");
		for (int i = 0; i < 100; i++) {
		    System.out.format(leftAlignFormat, "some data" + i, i * i, i * i, i * i );
		    System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");
		}
		//System.out.format(leftAlignFormat, "Page: ", 1,1,1);
		System.out.printf("|Page: 1000/1000	  			 TotalRecord: 1000000   |%n");
		System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");
	}
}
