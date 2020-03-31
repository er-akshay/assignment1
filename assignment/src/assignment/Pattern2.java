package assignment;

public class Pattern2 {

	public static void main(String[] args) {
		
		char i,j;
		for(i=65;i<=67;i++)
		{
			for(j=65;j<=67;j++)
			{
				if(i>=j)
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
