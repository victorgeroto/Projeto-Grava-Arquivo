package fpoo;

import java.io.IOException;
import java.util.Scanner;

public class GravaArquivo {
	
	public static void main(String[] args) throws IOException {
	Arquivo ler = new Arquivo();
	String gravar = "";
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("digite o texto");
	gravar=in.nextLine();
	
	ler.gravaArquivo(gravar);
	
	ler.LerArquivo(gravar);
	}
}
