package xo;

public class TickTackToeGame 
{
	private TickTackToeBoard board;
	private JucatorXO player1, player2;
	private JucatorXO jucatorCurent;
	
	public TickTackToeGame(JucatorXO player1, JucatorXO player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		StartJoc();
	}
	
	public void StartJoc()
	{
		board = new TickTackToeBoard();
		jucatorCurent = player1;
		System.out.println("A inceput un joc nou");
	}
	
	public void Mutare() throws Exception
	{
		if(Castigator() != null)
		{
			System.out.println("Jocul s-a terminat");
			StartJoc();
		}
		
		try 
		{
			jucatorCurent.Mutare(board);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			Mutare();
		}
		
		if(jucatorCurent == player1)
		{
			jucatorCurent = player2;
		}
		else
		{
			jucatorCurent = player1;
		}
		
		AfisareJoc();
	}

	public void AfisareJoc()
	{
		board.Afiseaza();
	}

	public JucatorXO Castigator()
	{
		char winner = board.GetWinner();
		
		if(winner == 'X')
		{
			return player1;
		}
		else if(winner == 'O')
		{
			return player2;
		}
		
		return null;
	}
	
	public int[][] GetMatrix()
	{
		return board.GetMatrix();
	}
	
	public boolean Remiza()
	{
		return board.NumarX() == 5 && 
			   board.NumarY() == 4 &&
			   Castigator() == null;
	}
}
