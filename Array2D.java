public class Array2D 
{
	public static void  main (String []args) 
	{
		final int [][] ages = 
			{ 
				{ 34, 45, 56, 60, 33}, 
				{ 5, 8, 9, 12, 15}
			};
		for (int r=0; r < ages.length; r++) //row
		{
			for (int c=0; c < ages[r].length; c++) //column
			{

				//for ROW (int r=0; r < ages.length; r++)  
				//for COLUMN (int c=0; < ages.length; c++) 
				System.out.print(ages[r][c] + "\t");
			}
				System.out.println(); 
		
		}
	}
}