package xo;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IInputJucator input = new ConsoleInputJucator();
		
		JucatorXO j1 = new JucatorXO("Ion", input);
		JucatorXO j2 = new JucatorXO("Om", input);
		
		TickTackToeGame joc = new TickTackToeGame(j1, j2);
		
		while(true)
		{
			joc.Mutare();
			if(joc.Castigator() != null)
			{
				System.out.println(joc.Castigator().Nume);
			}
		}
	}
	
	public static void TestComponente() throws Exception	
	{
		Matrice matrice = new Matrice(3, 3);
		
		matrice.Scrie(2, 1, 24);
		matrice.Scrie(0, 2, 3);
		
		matrice.Afiseaza();
		
		int[] coloana = matrice.CitesteColoana(2);
		int[] linie   = matrice.CitesteLinie(2);
		
		for(int i = 0; i < matrice.GetLinii(); i++)
		{
			System.out.print(coloana[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < matrice.GetColoane(); i++)
		{
			System.out.print(linie[i] + " ");
		}
		
		System.out.println("\nMatrice patratica-------------");
		
		MatricePatratica matricePatratica = new MatricePatratica(3);
		matricePatratica.Scrie(0, 0, 23);
		matricePatratica.Scrie(1, 1, 2);
		matricePatratica.Scrie(2, 2, 8);
		
		matricePatratica.Scrie(0, 2, 2);
		matricePatratica.Scrie(1, 1, 2);
		matricePatratica.Scrie(2, 0, 2);
		
		matricePatratica.Afiseaza();
		int[] diag1 = matricePatratica.CitesteDiagonalaPrincipala();
		int[] diag2 = matricePatratica.CitesteDiagonalaSecundara();
		
		for(int i = 0; i < matricePatratica.GetColoane(); i++)
		{
			System.out.print(diag1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < matricePatratica.GetColoane(); i++)
		{
			System.out.print(diag2[i] + " ");
		}
		
		System.out.println("Tick tack toe board------------");
		
		TickTackToeBoard board = new TickTackToeBoard();
		
		try
		{		
			board.Scrie(2, 1, 6);
			board.Scrie(0, 0, 2);
			board.Scrie(1, 1, 2);
			board.Scrie(1, 0, 2);
			board.Scrie(1, 2, 2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		board.Afiseaza();
		
		
	}
}
