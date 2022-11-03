package com;

public class Excuter {

	public static void main(String[] args) {
		
		ExcellReader ex = new ExcellReader("C:\\Users\\chintan\\Desktop\\Login.xlsx","mytest");
		int row =  ex.rowCount();
		System.out.println("Rows : "+row);
		int col = ex.colCount();
		System.out.println("cols : "+col);
		String data = ex.getData(3, 1);
		System.out.println("data : "+data);
		
		
		ExcellReader ex1 = new ExcellReader("C:\\Users\\chintan\\Desktop\\Login.xlsx","demo");
		int row1 =  ex1.rowCount();
		System.out.println("Rows : "+row1);
		int col1 = ex1.colCount();
		System.out.println("cols : "+col1);
	}

}
