
public class Face {

	public static void main(String[] args) {
		int[][] xd = new int[5][7];
		xd [1][0] = 1;
		xd [2][1] = 1;
		xd [3][0] = 1;
		xd [1][2] = 1;
		xd [3][2] = 1;
		xd [1][4] = 1;
		xd [2][4] = 1;
		xd [3][4] = 1;
		xd [1][5] = 1;
		xd [3][5] = 1;
		xd [2][6] = 3;
	
		for (int i = 0; i <xd.length; i++)
			
		{
			for (int j=0;j < xd[i].length; j++)
			{
				System.out.print( xd [i][j]);
			}
			System.out.println();
		}
	}

}
