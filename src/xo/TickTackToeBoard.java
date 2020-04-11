package xo;

// verifice conditia de victorie

public class TickTackToeBoard extends MatricePatratica {

	public TickTackToeBoard() {
		super(3);
	}

	@Override
	public void Afiseaza()
	{
		for(int i = 0; i < linii; i++)
		{
			for(int j = 0; j < coloane; j++)
			{
				char tmp = '_';
				
				if(data[i][j] == 1)
				{
					tmp = 'X';
				}
				else if(data[i][j] == 2)
				{
					tmp = 'O';
				}
				
				System.out.print(tmp);
			}
			
			System.out.println();
		}
	}
	
	@Override
	public void Scrie(int linie, int coloana, int valoare) throws Exception 
	{
		int nrX = numara(1);
		int nrO = numara(2);
		
		if(valoare == 1)//X
		{
			//sa nu am mai mult de 1 X in plus fata de nr de O
			if(nrX > nrO)
			{
				throw new Exception("Prea multe X-uri.");
			}
		}
		else if(valoare == 2)
		{
			//sa nu am mai multe O-uri decat X-uri
			if(nrO == nrX)
			{
				throw new Exception("Prea multe O-uri.");
			}
		}
		else 
		{
			throw new Exception("Trebuie sa scrii X (1) sau O (2).");
		}
		
		super.Scrie(linie, coloana, valoare);
	}
	
	public void Scrie(int linie, int coloana) throws Exception
	{
		int nrX = numara(1);
		int nrO = numara(2);
		
		if(data[linie][coloana] == 0)
		{
			if(nrX == nrO)
			{
				data[linie][coloana] = 1;
			}
			else
			{
				data[linie][coloana] = 2;
			}
		}
		else
		{
			throw new Exception("Exista deja o valoare la linia " + linie + " si coloana " + coloana + ".");
		}
	}
	
	//TO DO: refactorizare => de la 20 la 10 linii
	public char GetWinner()
	{
		int[] diag1 = CitesteDiagonalaPrincipala();
		int[] diag2 = CitesteDiagonalaSecundara();
		
		for(int i = 0; i < linii; i++)
		{
			int[] coloana = CitesteColoana(i);
			int[] linie   = CitesteLinie(i);
			
			char winner = verificaCastigator(coloana);
			if(winner != ' ')
			{
				return winner;
			}
			
			winner = verificaCastigator(linie);
			if(winner != ' ')
			{
				return winner;
			}			
		}
		
		char winner = verificaCastigator(diag1);
		if(winner != ' ')
		{
			return winner;
		}
		
		return verificaCastigator(diag2);
	}
	
	public int[][] GetMatrix()
	{
		int[][] rezultat = new int[3][3];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				rezultat[i][j] = data[i][j];
			}
		}
		
		return rezultat;
	}
	
	private char verificaCastigator(int[] coloana)
	{
		for(int j = 1; j < linii; j++)
		{
			if(coloana[j] != coloana[0] && coloana[0] != 0)
			{
				return ' ';
			}
		}
		
		if(coloana[0] == 1)
		{
			return 'X';
		}
		else if(coloana[0] == 2)
		{
			return 'O';
		}
		else 
		{
			return ' ';
		}
	}
	
	private int numara(int nr)//numara cate aparitii sunt in matrice
	{
		int rezultat = 0;
		for(int i = 0; i < linii; i++)
		{
			for(int j = 0; j < linii; j++)
			{
				if(data[i][j] == nr)
				{
					rezultat++;
				}
			}
		}
		
		return rezultat;
	}
	
	public int NumarX()
	{
		return numara(1);
	}
	
	public int NumarY()
	{
		return numara(2);
	}
}
