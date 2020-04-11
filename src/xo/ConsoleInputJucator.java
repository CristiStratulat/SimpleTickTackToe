package xo;
import java.util.Scanner;

public class ConsoleInputJucator implements IInputJucator {
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public int CitesteLinie() {
		// TODO Auto-generated method stub
		return scanner.nextInt();
	}

	@Override
	public int CitesteColoana() {
		// TODO Auto-generated method stub
		return scanner.nextInt();
	}					
}
