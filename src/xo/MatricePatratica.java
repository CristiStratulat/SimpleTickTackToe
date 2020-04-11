package xo;

public class MatricePatratica extends Matrice{

	public MatricePatratica(int linii) 
	{
		super(linii, linii);
	}
	
	public int[] CitesteDiagonalaPrincipala()
	{
		int[] rezultat = new int[linii];
		
		for(int i = 0; i < linii; i++)
		{
			rezultat[i] = data[i][i];
		}
		
		return rezultat;
	}
	
	public int[] CitesteDiagonalaSecundara()
	{
		int[] rezultat = new int[linii];
		
		int j = 0;
		for(int i = coloane - 1; i >= 0; i--)
		{
			rezultat[j] = data[i][j];
			j++;
		}
		
		return rezultat;
	}
}
