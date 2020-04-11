package xo;


public class JucatorXO 
{
	public final String  Nume;
	private IInputJucator input;
	
	public JucatorXO(String nume, IInputJucator input)
	{
		Nume = nume;
		this.input = input;
	}
	
	public void Mutare(TickTackToeBoard board) throws Exception
	{
		int linie, coloana;
		
		System.out.println("Muta " + Nume);
		
		System.out.println("Linia:");
		linie = input.CitesteLinie();
		
		System.out.println("Coloana:");
		coloana = input.CitesteColoana();
		
		board.Scrie(linie, coloana);
	}
}
