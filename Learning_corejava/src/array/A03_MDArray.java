package array;

public class A03_MDArray {
	public static void main(String[] args) {
		
		
		int a[][] = new int[3][2];
		
		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 100;
		a[1][1] = 200;
		
		a[2][0] = 10;
		a[2][1] = 200;
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
}
