package xo;

public class Matrice
{
	protected int[][] data;
	protected int linii, coloane;
	
	public int GetLinii()
	{
		return linii;
	}
	
	public int GetColoane()
	{
		return coloane;
	}
	
	public Matrice(int linii, int coloane)
	{
		this.linii   = linii;
		this.coloane = coloane;
		data         = new int[linii][coloane];
	}
	
	public void Scrie(int linie, int coloana, int valoare) throws Exception
	{
		data[linie][coloana] = valoare;
	}
	
	public void Afiseaza()
	{
		for(int i = 0; i < linii; i++)
		{
			for(int j = 0; j < coloane; j++)
			{
				System.out.print(data[i][j] + "   ");
			}
			
			System.out.println();
		}
	}
	
	public int[] CitesteColoana(int indexColoana)
	{
		int[] rezultat = new int[linii];
		
		for(int i = 0; i < linii; i++)
		{
			rezultat[i] = data[i][indexColoana];
		}
		
		return rezultat;
	}
	
	public int[] CitesteLinie(int indexLinie)
	{
		int[] rezultat = new int[coloane];
		
		for(int i = 0; i < coloane; i++)
		{
			rezultat[i] = data[indexLinie][i];
		}
		
		return rezultat;
	}
}
